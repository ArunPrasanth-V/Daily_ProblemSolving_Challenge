// 318. Maximum Product of Word Lengths
// https://leetcode.com/problems/maximum-product-of-word-lengths/
class Solution {
    public int maxProduct(String[] words) {
      int bits[]=new int[words.length];
        
        for(int i=0;i<words.length;i++){
            bits[i]=sum(words[i]);
        }
        int max=0;
        
        for(int i=0;i<words.length;i++){
            boolean isUnique=true;
           for(int j=0;j<words.length;j++){
             if((bits[i]& bits[j])==0){
                   max=Math.max((words[i].length()*words[j].length()),max);
               }
        }
            
        }
        return max;
    }
    public static int sum(String s){
        int v=0;
        for(int i=0;i<s.length();i++){
            v=v|(1<<(s.charAt(i)-'a'));
        }
        return v;
    }
}
