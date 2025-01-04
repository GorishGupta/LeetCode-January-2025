public class DS1930 {
        public int countPalindromicSubsequence(String s) {
            int[] hs = new int[26];
            int[] after = new int[26];
            boolean[] appear = new boolean[26];
            for (char c : s.toCharArray()) {
                int i = c - 'a';
                if (appear[i]) {
                    hs[i] |= after[i];
                }
                for (int j = 0; j < 26; j++) {
                    if (appear[j]) {
                        after[j] |= (1 << i);
                    }
                }
                appear[i] = true;
            }
            int ans = 0;
            for (int x : hs) {
                ans += Integer.bitCount(x);
            }
            return ans;
        }
        
}

