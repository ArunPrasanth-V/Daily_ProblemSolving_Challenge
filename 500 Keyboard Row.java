// 500. Keyboard Row
// https://leetcode.com/problems/keyboard-row/
class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop",row2="asdfghjkl",row3="zxcvbnm";
        ArrayList<String> arr=new ArrayList<>();
        int n=1;
        for(String s: words){
             String temp=s;
             s=s.toLowerCase();
            if(row1.contains(s.charAt(0)+""))
                n=0;
            else if(row2.contains(s.charAt(0)+""))
                n=1;
            else 
                n=2;
            boolean valid=true;
            
           
            for(int i=1;i<s.length();i++){
                 if(n==0 && row1.contains(s.charAt(i)+""))
                     continue;
                 if(n==1 && row2.contains(s.charAt(i)+""))
                     continue;
                 if(n==2 && row3.contains(s.charAt(i)+""))
                     continue;
                valid=false;
            }
            if(valid)
            {
                arr.add(temp);
            }
        }
        System.out.println(arr);
        return arr.toArray(new String[0]);
    }
}
