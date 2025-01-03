public class DS2270 {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long prefsum[] = new long[n];
        prefsum[0] = nums[0];
        for(int i=1;i<n;i++){
            prefsum[i] = prefsum[i-1] + nums[i];
        }
        int count = 0;
        for(int i=0;i<n-1;i++){
            long leftsum = prefsum[i];
            long rightsum = prefsum[n-1]-prefsum[i];
            if(leftsum >= rightsum){
                count++;
            }
        }
        return count;
    }
}