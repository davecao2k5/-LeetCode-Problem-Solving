class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int hight= nums.length-1;
        while(low<=hight){
            int mid=low +(hight - low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                low = mid+1;
            } else{
                hight = mid -1;
            }
        }
        return low;
    }
}