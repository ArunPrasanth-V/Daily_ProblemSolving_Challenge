//   https://leetcode.com/problems/longest-substring-without-repeating-characters/
//   3. Longest Substring Without Repeating Characters
class Solution {
    public int lengthOfLongestSubstring(String str) {
        int max=0;
		int count=0;
		List<Character> arr=new ArrayList<>();
		for(char c:str.toCharArray())
		{
			while(arr.contains(c))
			{
				arr.remove(0);
				count--;
			}
			if(!arr.contains(c))
			{
				arr.add(c);
				count++;
			}

			if(count>max)
				max=count;
		}
        return max;
        
    }
}
