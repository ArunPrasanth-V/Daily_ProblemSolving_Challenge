// 394. Decode String
// https://leetcode.com/problems/decode-string/
class Solution {
    public String decodeString(String s) {
        Stack<Integer> count=new Stack<>();
        Stack<String> result=new Stack<>();
        String letters="";
        int i=0;
        while(i<s.length())
        {
           if(Character.isDigit(s.charAt(i)))
           {
               int c=0;
               while(Character.isDigit(s.charAt(i)))
               {
                   c=(c*10)+(s.charAt(i)-'0');
                   i+=1;
               }
               count.push(c);
           }
           else if(s.charAt(i)=='[')
           {
               result.push(letters);
               letters="";
               i+=1;
           }
           else if(s.charAt(i)==']')
           {
               StringBuilder str=new StringBuilder(result.pop());
               int c=count.pop();
               for(int j=0;j<c;j++)
               {
                   str.append(letters);
               }
              letters=str.toString();
               i+=1;
           }
           else{
               letters+=s.charAt(i);  
               i+=1;
           }
        }
        return letters;
    }
}
