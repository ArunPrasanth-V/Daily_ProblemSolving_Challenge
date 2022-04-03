// 224. Basic Calculator
// https://leetcode.com/problems/basic-calculator/
class Solution {
    public int calculate(String s) {
        int sign=1,result=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            int sum=0;
            while(i<s.length() && Character.isDigit(s.charAt(i)))
            {
              sum=sum*10+Integer.parseInt(String.valueOf(s.charAt(i)));
                i++;
            }
            result+=(sum*sign);
            if(i==s.length()) break;
            if(s.charAt(i)=='-')
                sign=-1;
            else if(s.charAt(i)=='+')
                sign=1;
            else if(s.charAt(i)=='('){
                stack.push(result);
                stack.push(sign);
                sign=1;result=0;
            }
            else if(s.charAt(i)==')'){
                sign=stack.pop();
                sum=stack.pop();
                result=  sum+(sign*result);
                
            }
        }
        return result;
    }
}
