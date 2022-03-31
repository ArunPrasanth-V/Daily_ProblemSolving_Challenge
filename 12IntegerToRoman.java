// 12. Integer to Roman
// https://leetcode.com/problems/integer-to-roman/
class Solution {
    public String intToRoman(int num) {
       int[]  val= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    

        StringBuilder str=new StringBuilder();
        
       for(int i=0;i<val.length;)
       {
        if(num >= val[i]) {
            num -= val[i];
            str.append(roman[i]);
        }
           else
               i++;
        }
        return str.toString();
    }
}
