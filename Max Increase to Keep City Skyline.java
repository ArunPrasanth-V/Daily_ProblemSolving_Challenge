//807. Max Increase to Keep City Skyline
//https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) 
    {
        int maxRow[]=new int[grid.length];
        int maxCol[]=new int[grid.length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                maxRow[i]=Math.max(maxRow[i],grid[i][j]);
                maxCol[j]=Math.max(maxCol[j],grid[i][j]);
            }
        }
        int sum=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                int min=Math.min(maxRow[i],maxCol[j]);
                if(min>grid[i][j])
                sum+=min-grid[i][j];
            }
        }
       return sum;
    }
}
