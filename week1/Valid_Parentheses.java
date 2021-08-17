/* Problem Description:
     Given a parentheses we need to find if it is valid or not 
     Input: s = "()[]{}"  Output: true    ,  Input: s = "([)]" Output: false
     
     
     1)am going to add each element in the stack .it means all opens "[ ( {" and closer  "] ) }"
     2)if the current element is closer means check the opener if the that peak element belong to that colser or not
     3)if it is true mean i will pop the element.
     4)else push that current element.
     5)repeat until the last  char in a string.
     6)finally check wether the stack is empty or not
     7)Empty means true (Valid) else flase (Invalid)
     

*/



class Valid_Parentheses {
    public boolean isValid(String s) {
        if(s.length()%2 != 0)return false;
        Stack<Character> stack=new Stack<>();
        
        for(char c: s.toCharArray()){
         if(c=='('||c=='{'||c=='['){
             stack.push(c);
        }else if(c==')'&& !stack.isEmpty() &&stack.peek()=='('){
             stack.pop();
        }else if(c=='}'&& !stack.isEmpty() &&stack.peek()=='{'){
            stack.pop();
        }else if(c==']'&&!stack.isEmpty() &&stack.peek()=='['){
             stack.pop();}
        else  stack.push(c);
        }
     return stack.isEmpty();
    }
}
