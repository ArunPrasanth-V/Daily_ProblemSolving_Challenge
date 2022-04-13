// https://leetcode.com/problems/spiral-matrix-ii/
// 59. Spiral Matrix II
class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int rowBegin=0;
        int colBegin=0;
        int rowEnd=n-1;
        int colEnd=n-1;
        int counter=1;
        while(rowBegin<=rowEnd &&colBegin<=colEnd)
        {
            for(int i=rowBegin;i<rowEnd;i++)
            {
                arr[rowBegin][i]=counter++;
            }
            rowBegin++;
            for(int i=colBegin;i<=colEnd;i++)
            {
                arr[i][colEnd]=counter++;
            }
            colEnd--;
            
            if(rowBegin<=rowEnd)
            {
                for(int i=colEnd;i>=colBegin;i--)
                {
                    arr[rowEnd][i]=counter++;
                }
                rowEnd--;
            }
            if(colBegin<=colEnd){
                for(int i=rowEnd;i>=rowBegin;i--)
                {
                    arr[i][colBegin]=counter++;
                }
                
                colBegin++;
            }
            
        }
        return arr;
       
    }
}
