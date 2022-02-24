// 409. Longest Palindrome
// https://leetcode.com/problems/longest-palindrome/

class Solution {
    public int longestPalindrome(String s) {
     int[] char_arr=new int[128];
        for(int c:s.toCharArray())
        {
            char_arr[c]++;
        }
        int result=0;
        for(Integer count:char_arr)
        {
        result+=count/2*2;
            if(result%2==0 && count%2==1)
                result+=1;
        }
        return result;
    }
}
