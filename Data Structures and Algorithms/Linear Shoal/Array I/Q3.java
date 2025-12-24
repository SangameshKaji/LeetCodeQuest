// Q3. Max Consecutive Ones
class Q3 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
            }else{
                if(max<count){
                    max = count;
                    count = 0;
                }else{
                    count = 0;
                }
            }
        }
        return Math.max(count, max);
    }
}