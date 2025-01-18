import java.util.Deque;
import java.util.LinkedList;

public class DS1368 {
    class Solution {
    public int minCost(int[][] grid) {
       rows = grid.length;
        cols = grid[0].length;
        visited = new boolean[rows][cols];
        
        int cost = 0;
        runAll(grid, 0,0);
        //System.out.println(dq.size());
        while(!dq.isEmpty()) {
            for(int round = dq.size(); round>0; round--) {
                int[] cur= dq.pollFirst();
                int r=cur[0], c=cur[1];
                if(r==rows-1 && c==cols-1) return cost;
                runAll(grid, r, c);
                for(int k=0; k<4; k++) {
                    runAll(grid, r+dr[k], c+dc[k]);
                }
            }
            cost++;
        }
        return -1;
    }
    Deque<int[]> dq = new LinkedList();
    int[] dr = new int[]{0,0,1,-1}, dc = new int[]{1,-1,0,0};
    boolean[][] visited;
    int rows, cols;
    
    private void runAll(int[][] grid, int r, int c) {
        while(r>=0 && r<rows && c >= 0 && c<cols && !visited[r][c]) {
            visited[r][c] = true;
            int dir = grid[r][c]-1;
            dq.addLast(new int[]{r,c});
            r += dr[dir];
            c += dc[dir];
        }
    }
}
public static void main(String[] args) {
    DS1368 d = new DS1368();
    DS1368.Solution s = d.new Solution();
    int[][] grid = {{1,1,1,1},{2,2,2,2},{1,1,1,1},{2,2,2,2}};
    System.out.println(s.minCost(grid));
}
}
