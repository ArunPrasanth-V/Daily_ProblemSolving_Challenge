// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// 3. Longest Substring Without Repeating Characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
          Queue<Character> q= new LinkedList<>();
          int count=0;
          int max=0; 
         for(int i=0;i<s.length();i++)
         {
             while(q.contains(s.charAt(i)))
             {
                 count--;
                 q.remove();
             }
             if(!q.contains(s.charAt(i))){
                 q.add(s.charAt(i));
                 count++;
             }
            max=Math.max(count,max); 
         }
        return max;
    }
}
