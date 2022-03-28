// 49. Group Anagrams
// https://leetcode.com/problems/group-anagrams/
class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String,List<String>> map =new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
          char[] c=arr[i].toCharArray();
          Arrays.sort(c);
          String str=new String(c);
     
            if(!map.containsKey(str))
                map.put(str,new ArrayList<>());
             map.get(str).add(arr[i]);
        }
        return new ArrayList<>(map.values());
    }
}

