/* Problem Discription :
      Given an String we need to convert into equalent number 
      
      Input: columnTitle = "AB" Output: 28
      1)Inside the for loop each char parse and the number
      2)Reducuing given char - 'a'+1 //if a mean we get 1 and res added as 1 if next element 'b' means again come in loop 26+2=28
      3)In the same way evertime work
*/

class Excel_Sheet_Column_Number{
    public int titleToNumber(String columnTitle) {
        int res=0;
        for(int i:columnTitle.toCharArray())
        {
            res=res*26+(i-'A'+1);
        }
        return res;
    }
}
