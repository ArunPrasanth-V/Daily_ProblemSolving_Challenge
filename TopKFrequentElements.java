// https://leetcode.com/problems/top-k-frequent-elements/
// 347. Top K Frequent Elements
class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //sort the map based on value.
        ArrayList<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)-> map.get(b)-map.get(a));
      
        int []newarr=new int[k];
        for(int i=0;i<k;i++)
        {
            newarr[i]=list.get(i);
        }
    return newarr;      
    }
}
