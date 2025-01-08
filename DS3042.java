import java.util.*;
public class DS3042{
    class Solution {
        public int countPrefixSuffixPairs(String[] words) {
            int res = 0;
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (isPrefixAndSuffix(words[i], words[j])) {
                        res += 1;
                    }
                }
            }
            return res;
        }
        
        boolean isPrefixAndSuffix(String s1, String s2) {
            return s2.startsWith(s1) && s2.endsWith(s1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            DS3042 d = new DS3042();
            DS3042.Solution s = d.new Solution();
            String[] words = {"a", "b", "a", "c", "b", "a"};
            System.out.println(s.countPrefixSuffixPairs(words));
            sc.close();
        }
    }
}
