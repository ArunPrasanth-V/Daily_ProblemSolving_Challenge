// https://leetcode.com/problems/valid-sudoku/
// 36. Valid Sudoku
class Solution {
    public boolean isValidSudoku(char[][] arr) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!='.'){
                    String row=arr[i][j]+"row in"+i;
                    String col=arr[i][j]+"col in"+j;
                    String box=arr[i][j]+"box in"+i/3+"and"+j/3;
                    
                    if(set.contains(row) || set.contains(col)|| set.contains(box))
                        return false;
                    set.add(row);
                     set.add(col);
                     set.add(box);
                }
            }
        }
        return true;
    }
}
