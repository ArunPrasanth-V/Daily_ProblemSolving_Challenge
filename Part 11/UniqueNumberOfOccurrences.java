// https://leetcode.com/problems/unique-number-of-occurrences/
// 1207. Unique Number of Occurrences
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr)
        {
            int count=map.getOrDefault(i,0);
             map.put(i,count+1);
        }
        Set<Integer> set=new HashSet<>();
        for(int i:map.keySet())
        {
            set.add(map.get(i));
        }
        return map.size()==set.size();
    }
}
