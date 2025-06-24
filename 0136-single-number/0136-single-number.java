class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int[] arr = new int[60002];

        for(int i=0; i<n; i++){
            arr[nums[i] + 30000] ++;
        }

        int result = 0;
        for(int i=0; i<60001; i++){
            if(arr[i] == 1){
                result = i-30000;
            }
        }
        return result;
    }
}