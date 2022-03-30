// 46. Permutations
// https://leetcode.com/problems/permutations/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        boolean []bool=new boolean[nums.length];
        permutation(nums,list,arr,bool);
        return list;
    }
    private void permutation(int[] nums,List<List<Integer>> list, List<Integer> arr,boolean []flag) 
    {
        if(arr.size()==nums.length)
        {
            list.add(new ArrayList(arr));
            return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!flag[i])
            {
                arr.add(nums[i]);
                flag[i]=true;
                permutation(nums,list,arr,flag);
                arr.remove(arr.size()-1);
                flag[i]=false;
            }
        }
    }
}
