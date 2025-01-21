public class DS2017 {
    class Solution {

        public long gridGame(int[][] grid) {
            // Calculate the sum of all the elements for the first row
            long firstRowSum = 0;
            for (int num : grid[0]) {
                firstRowSum += num;
            }
            long secondRowSum = 0;
            long minimumSum = Long.MAX_VALUE;
            for (int turnIndex = 0; turnIndex < grid[0].length; ++turnIndex) {
                firstRowSum -= grid[0][turnIndex];
                // Find the minimum maximum value out of firstRowSum and
                // secondRowSum.
                minimumSum = Math.min(
                    minimumSum,
                    Math.max(firstRowSum, secondRowSum)
                );
                secondRowSum += grid[1][turnIndex];
            }
            return minimumSum;
        }
    }
    public static void main(String[] args) {
        
        DS2017 d = new DS2017();
        DS2017.Solution s = d.new Solution();
        int[][] grid = {
            {2, 5, 4},
            {1, 5, 1}
        };
        System.out.println(s.gridGame(grid));
    }
}
