public class DS2429 {
    class Solution {
        public int minimizeXor(int num1, int num2) {
            int a = Integer.bitCount(num1);
            int b = Integer.bitCount(num2);
            int res = num1;
            for (int i = 0; i < 32; i++) {
                if (a > b && ((1 << i) & num1) > 0) {
                    res ^= 1 << i;
                    a--;
                }
                if (a < b && ((1 << i) & num1) == 0) {
                    res ^= 1 << i;
                    a++;
                }
            }
            return res;
        }
    }
    public static void main(String[] args) {
        DS2429 d = new DS2429();
        Solution s = d.new Solution();
        System.out.println(s.minimizeXor(5, 3));
    }
}
