// Q2. How Many Numbers Are Smaller Than the Current Number
class Q2{
    public int[] smallerNumbersThanCurrent(int[] arr ){
        int nums[] = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            int count = 0;
            for(int j =0;j<arr.length;j++){
                if(arr[i] != arr[j] && arr[i]>arr[j]){
                    count+=1;
                }
            }
            nums[i] = count;
        }
        return nums;
    }
}