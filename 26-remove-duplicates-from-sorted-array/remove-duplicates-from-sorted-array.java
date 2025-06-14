class Solution {
    public int removeDuplicates(int[] nums) {
       int counting=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=nums[counting]){
            counting++;
            nums[counting]=nums[i];
        }
       }
        return counting+1;


    }
}