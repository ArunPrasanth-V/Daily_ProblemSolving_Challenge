/*
 Problem Description :
    they are given a roman we need to find the Aprapriate number  Eg; Input: s = "III" Output: 3
    Already we know that we have some standard roman letter. i listed given below the program .
    am goning to parse each char and get perticular number which it has the key value in the map.
    supposr the currnent element is grater then pervious element mean .we shouldn't add that number we need to delete that
    so, i gave that 1st if condition.
    finally return the number

*/

//here am  gave only the logic i did't written main method.
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500); 
        m.put('M',1000);
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            if(i>0&&m.get(s.charAt(i))>m.get(s.charAt(i-1)))
                 result+=m.get(s.charAt(i))-2*m.get(s.charAt(i-1));
            else
                  result+=m.get(s.charAt(i));
        }
        return result;
    }
}
