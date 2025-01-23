public class DS1267 {
    class Solution {
        public int countServers(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int count = 0;
            int[] rowCount = new int[m];
            int[] colCount = new int[n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        rowCount[i]++;
                        colCount[j]++;
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1 && (rowCount[i] > 1 || colCount[j] > 1)) {
                        count++;
                    }
                }
            }
    
            return count;
        }
    }
    public static void main(String[] args) {
        DS1267 d = new DS1267();
        DS1267.Solution s = d.new Solution();
        int[][] grid = {
            {1, 0},
            {0, 1}
        };
        System.out.println(s.countServers(grid)); // 0
        grid = new int[][] {
            {1, 0},
            {1, 1}
        };
        System.out.println(s.countServers(grid)); // 3
        grid = new int[][] {
            {1, 1, 0, 0},
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 1}
        };
        System.out.println(s.countServers(grid)); // 4
    }
}
