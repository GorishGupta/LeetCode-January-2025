public class DS2683 {
    class Solution {
        public boolean doesValidArrayExist(int[] derived) {
            int res = 0;
            for (int x : derived) {
                res ^= x;
            }
            return res == 0;
        }
    }
    public static void main(String[] args) {
        DS2683 d = new DS2683();
        DS2683.Solution s = d.new Solution();
        int[] derived = {1, 2, 3, 4};
        System.out.println(s.doesValidArrayExist(derived));
    }
}
