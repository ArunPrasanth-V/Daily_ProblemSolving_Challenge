// https://leetcode.com/problems/number-of-segments-in-a-string/
// 434. Number of Segments in a String

class Solution {
    public int countSegments(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
                while(i<s.length() && s.charAt(i)!=' ')
                {
                    i++;
                }
            }
        }
        return count;
    }
}
