// 242. Valid Anagram
// https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       
        return Arrays.toString(arr2).equals(Arrays.toString(arr1));
        }
}
