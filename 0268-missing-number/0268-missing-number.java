class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        //3
        int[] arr = new int[n+1]; 
        //0 1 2 3
        
        for(int i=0; i<n; i++){
            arr[nums[i]] ++;
        }

        int result = 0;
        for(int i=0; i<n+1; i++){
            if(arr[i]==0){
                result = i;
            }
        }

        return result;
    }
}