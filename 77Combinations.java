// 77. Combinations
// https://leetcode.com/problems/combinations/
class Solution {
    public List<List<Integer>> combine(int n, int k) {
  
        List<List<Integer>> lists=new LinkedList<>();
        List<Integer> list=new LinkedList<>();
        
        if(n <= 0 || k <= 0){
            return lists;
        }
        combination(n,k,lists,list,1);
        return lists;
    }
 static void combination(int n,int k,List<List<Integer>> lists,List<Integer> list,int start)
    {
        if(list.size()>k) return;
        
        if(list.size() == k)
        {
            if(!lists.contains(list))
            {
                lists.add(new LinkedList<Integer>(list));
                return;
            }
        }
         if(start<1 ||start > n)
             return;
            
        for(int i = start; i <= n; i++)
        {
            list.add(i);
            combination(n, k, lists, list, i + 1);
            list.remove(list.size() - 1);
        }
        
    }
  
       
}
