class Solution {
    int resultLength;
    int resultstart;
    public String longestPalindrome(String s) {
        if(s.length()==0||s.length()<2)
            return s;
        for(int start=0;start<s.length()-1;start++){
            expandRange(s,start,start);
            expandRange(s,start,start+1);           
        }   
        return s.substring(resultstart,resultstart+resultLength);
    }
    private void expandRange(String s,int start,int end)
    {
        while((start>=0&&end<s.length())&&(s.charAt(start)==s.charAt(end)))
        {
            start--;
            end++;
        }
        if(resultLength<end-start-1)
        {
            resultstart=start+1;
            resultLength=end-start-1;
        }
    }
}
