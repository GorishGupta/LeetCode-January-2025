public class DS2185 {
    class Solution {
        public int prefixCount(String[] words, String pref) {
            int count =0;
            for(int i=0;i<words.length;i++){
                if(words[i].startsWith(pref))
                count++;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        DS2185 d = new DS2185();
        DS2185.Solution s = d.new Solution();
        String[] words = {"a", "b", "a", "c", "b", "a"};
        System.out.println(s.prefixCount(words, "a"));
    }
}
