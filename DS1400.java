public class DS1400 {
    class Solution {
        public boolean canConstruct(String s, int k) {
            if (s.length() < k) return false;
            if (s.length() == k) return true;
            int[] freq = new int[26];
            int oddCount = 0;
            for (char chr : s.toCharArray()) {
                freq[chr - 'a']++;
            }
            for (int count : freq) {
                if (count % 2 == 1) {
                   oddCount++;
                }
            }
            return oddCount <= k;
        }
    }
    public static void main(String[] args) {
        int k = 3;
        String s = "annabelle";
        Solution sol = new DS1400().new Solution();
        System.out.println(sol.canConstruct(s, k));
    }
}
