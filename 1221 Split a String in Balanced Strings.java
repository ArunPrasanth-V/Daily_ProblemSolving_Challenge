//https://leetcode.com/problems/split-a-string-in-balanced-strings
// 1221. Split a String in Balanced Strings
class Solution {
    public int balancedStringSplit(String s) {
    int c=0;
    int r=0;
      for(char i:s.toCharArray()){
        r+= i=='L'?1:-1;
          if(r==0)
              c++;
      }
        return c;
    }
    
}
