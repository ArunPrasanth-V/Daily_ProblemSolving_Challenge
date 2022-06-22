// https://leetcode.com/problems/first-unique-character-in-a-string/
// 387. First Unique Character in a String
class Solution {
    public int firstUniqChar(String s) {
        int ans=Integer.MAX_VALUE;
        for(char c='a';c<='z';c++){
            int i=s.indexOf(c);
            if(i!=-1 && i==s.lastIndexOf(c))
                ans=Math.min(ans,i);
        }
        if(ans==Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
