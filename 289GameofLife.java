// 289. Game of Life
// https://leetcode.com/problems/game-of-life/
class Solution {
    public void gameOfLife(int[][] board) {
        
        int col=board.length;
        int row=board[0].length;
         int arr[][]=new int[col][row];
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                int count=neighborsCount(board,i,j);
                if(board[i][j]==0 && count==3)
                     arr[i][j]=1;
                
                else if(board[i][j]==1 && (count==2 ||count==3))
                    arr[i][j]=1;
                     
            }
        }
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                board[i][j]=arr[i][j];
            }
        }
    }
    static int neighborsCount(int [][]arr,int i,int j)
    {
        int count=0;
        int n[][]={
                 {-1,-1},{-1,0},{-1,1},
                 {0,-1},{0,1},
                 {1,-1},{1,0},{1,1}
                };
        
        for(int dia[]:n)
        {
            int x=dia[0]+i;
            int y=dia[1]+j;
            if(x>=0 && y>=0 && x<arr.length && y<arr[0].length && arr[x][y]==1)
                count++;
                
        }
        return count;
    }
}
