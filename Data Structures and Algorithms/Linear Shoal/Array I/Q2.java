// Q2. Shuffle the Array
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int num[] = new int[2*n];
        int c = n;
        for(int i = 0,j = 0;i<n;i++,j+=2,c++){
            num[j] = nums[i];
            num[j+1] = nums[c];
        }
        return num;
    }
}