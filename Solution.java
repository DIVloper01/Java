class Solution {
    public static boolean canJump(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i+nums[i]]==0){
                return false;
            }
            else if(nums[i+nums[i]]==nums.length){
                return true;
            }
        }
        return true;    
    }
    public static void main(String args[]){
        int[]nums={2,3,1,1,4};
        canJump(nums);
    }
}