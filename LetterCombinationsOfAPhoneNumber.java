// 17. Letter Combinations of a Phone Number
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
class Solution {
    public List<String> letterCombinations(String digits) {       
        LinkedList<String> list=new LinkedList();
        String str[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
           if(digits.length()==0)
               return list;
        list.add("");
        for(int i=0;i<digits.length();i++)
        {
           int index=Integer.parseInt(digits.charAt(i)+"");
            while(list.peek().length() ==i)
            {
                  String ch=list.remove();
                for(char c:str[index].toCharArray())
                {
                    list.add(ch+c);
                }
            }
        }
        return list;
    }
}
