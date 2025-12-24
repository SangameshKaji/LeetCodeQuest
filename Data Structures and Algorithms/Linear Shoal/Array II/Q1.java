// Q1. Set Mismatch
import java.util.Arrays;
class Q1{
    public static int miss(int nums[]){
        int c = repeat(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==c){
                nums[i] = 0;
                break;
            }
        }
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
    public static int repeat(int nums[]){
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int ans[] = new int[2];
        ans[0] = repeat(nums);
        ans[1] = miss(nums);
        return ans;
    }
}