import java.util.*;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long sum = 0;
        int cnt = k1 + k2;

        //값 차이를 인덱스로 한 count 배열
        int[] count = new int[100001];
        int maxDiff = 0;

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            count[diff]++;
            maxDiff = Math.max(maxDiff, diff);
        }

        for (int i = maxDiff; i > 0 && cnt > 0; i--) {
            if (count[i] == 0)
                continue;

            int ops = Math.min(cnt, count[i]);

            //같은 diff를 가진 것들을 한번에 1씩 빼줌
            count[i] -= ops;
            count[i - 1] += ops;
            cnt -= ops;
        }

        for (int i = 1; i <= 100000; i++) {
            sum += Math.pow(i, 2) * count[i];
        }

        return sum;
    }
}