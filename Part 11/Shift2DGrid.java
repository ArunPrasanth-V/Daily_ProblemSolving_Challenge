// https://leetcode.com/problems/shift-2d-grid/
// 1260. Shift 2D Grid
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList();
        
        int rows = grid.length;// 9
        int col = grid[0].length;// 3 
        
        k %= (rows * col); // 1%(27);
        int dimension = rows * col; // 27
        int begin = dimension - k;// 27 -1 =26
        int x = 0;
        
        for (int r = 0; r < rows; r++)
        result.add(new ArrayList());
        
        for (int i = begin; i < begin + dimension; i++) {
            // i=26 
            int r = (i / col) % rows, c = i % col;
            result.get(x / col).add(grid[r][c]);
            x++;
        }
        return result;
    }

}
