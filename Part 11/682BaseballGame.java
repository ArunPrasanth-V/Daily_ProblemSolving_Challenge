// 682. Baseball Game
// https://leetcode.com/problems/baseball-game/
class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> arr=new ArrayList<>();
        int first=0;
        int sum=0;
        for(int i=0;i<ops.length;i++)
        {
            if(ops[i].equals("D"))
            {
                first=arr.get(arr.size()-1)*2;
                arr.add(first);
                sum+=first;
            }
            else if(ops[i].equals("C"))
            {
                sum-=arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
            }
            else if(ops[i].equals("+"))
            {
                first=arr.get(arr.size()-1) + arr.get(arr.size()-2);
                sum+=first;
                arr.add(first);
            }
            else{
                arr.add(Integer.parseInt(ops[i]));
                sum+=Integer.parseInt(ops[i]);
            }
        }
        return sum;
        
    }
}
