// 1678. Goal Parser Interpretation
// https://leetcode.com/problems/goal-parser-interpretation/
class Solution {
    public String interpret(String c) {
        StringBuilder br=new StringBuilder();
        for(int i=0;i<c.length();i++){
          if(c.charAt(i)=='G')
          {
              br.append("G");
          }
        else if(i<c.length()-1 && c.charAt(i)=='(' && c.charAt(i+1)==')')
        {
            br.append("o");
            i++;
        }
        else if(i<c.length()-3 &&c.charAt(i)=='(' && c.charAt(i+1)=='a' && c.charAt(i+2)=='l' && c.charAt(i+3)==')')
        {  br.append("al");
            i+=2;
        }
        }
        
    return br.toString();
    }
}
