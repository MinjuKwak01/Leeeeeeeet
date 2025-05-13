import java.util.*;
class Solution {
       public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int[] cnt = new int[202];
        for (int num : nums) {
            cnt[num + 100]++;
        }
        
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int adjustedValue = nums[i] + 100;
            
            if (cnt[adjustedValue] > 0) {
                nums[index] = nums[i];
                index++;
                cnt[adjustedValue] = 0; 
            }
        }
        
        return index; 
    }
}