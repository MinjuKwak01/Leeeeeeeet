### PQ로 풀면 시간초과
cnt = k1 + k2 최대값이 10^9이므로 최악의 경우 10억 × log n의 시간복잡도를 갖게됨

```java
import java.util.*;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        long sum = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < nums1.length; i++) {
            int first = nums1[i];
            int second = nums2[i];
            pq.offer(Math.abs(first - second));
        }

        int cnt = k1 + k2;
        if (cnt != 0) {
            while (cnt > 0) {
                int diff = pq.poll();
                if (diff == 0) {
                    break;
                }
                diff--;
                pq.offer(diff);
                cnt--;

            }
        }
        while (!pq.isEmpty()) {
            sum += Math.pow(pq.poll(), 2);
          //  System.out.println(sum);
        }

        return sum;
    }
}
```
