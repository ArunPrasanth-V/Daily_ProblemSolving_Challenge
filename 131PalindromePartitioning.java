// 131. Palindrome Partitioning
// https://leetcode.com/problems/palindrome-partitioning/
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> lists=new ArrayList<>();
        List<String>list=new ArrayList<>();
        func(0,s,list,lists);
        return lists;
    }
    
    void func(int index,String s,List<String>list,List<List<String>> lists)
    {
        if(index==s.length())
        {
            lists.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<s.length();++i)
        {
            if(isPalindrome(index,i,s))
            {
                list.add(s.substring(index,i+1));
                func(i+1,s,list,lists);
                list.remove(list.size()-1);
            }
        }
    }
    boolean isPalindrome(int start,int end,String s)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
