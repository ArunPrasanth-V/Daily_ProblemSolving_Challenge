// 48. Rotate Image
// https://leetcode.com/problems/rotate-image/
class Solution {
    public void rotate(int[][] arr) {
        //convert this matrix into transpose matrix.
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr[i].length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        //revese the row.
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length/2;j++)
            {
                int len=arr.length-1-j;
                int temp=arr[i][j];
                arr[i][j]=arr[i][len];
                arr[i][len]=temp;
            }
        }

    }
}
