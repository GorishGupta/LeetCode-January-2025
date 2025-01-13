public class DS2116 {
    class Solution {
        public boolean canBeValid(String s, String locked) {
            int n = s.length(); 
            if (n % 2 != 0) {
                return false;
            }
            
            int balance = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(' || locked.charAt(i) == '0') {
                    balance++;
                } else {
                    balance--;
                }
                if (balance < 0) return false;
            }
            
            balance = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == ')' || locked.charAt(i) == '0') {
                    balance++;
                } else {
                    balance--;
                }
                if (balance < 0) return false;
            }
            
            return true;
        }
    public static void main(String[] args) {
        String s = "(()))";
        String locked = "01000";
        Solution sol = new DS2116().new Solution();
        System.out.println(sol.canBeValid(s, locked));
    }
}
