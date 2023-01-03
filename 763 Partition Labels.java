// 763. Partition Labels
// https://leetcode.com/problems/partition-labels/description/
class Solution {
    public List<Integer> partitionLabels(String s)
     {
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
           map.put(s.charAt(i),i);
       }    
       ArrayList<Integer> result=new ArrayList<>();
        int max=0;
        int pre=-1;
       for(int i=0;i<s.length();i++)
       {
           max=Math.max(max,map.get(s.charAt(i)));
           if(max==i)
           {
               result.add(max-pre);
               pre=max;
           }
       }
       return result;
    }
}
