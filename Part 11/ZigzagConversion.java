
// https://leetcode.com/problems/zigzag-conversion/
// 6. Zigzag Conversion
class Solution {
    public String convert(String s, int n) {
        Map<Integer,StringBuilder> str=new HashMap<>();
        int pos=0;
        boolean dir=true;
        for(char i:s.toCharArray())
        {
            if(pos==n) dir=false;
            if(pos==1) dir=true;
            if(dir)
                pos++;
            else
                pos--;
            if(!str.containsKey(pos))
            {
                str.put(pos,new StringBuilder());
            }
            str.get(pos).append(i);
        }
        StringBuilder br=new StringBuilder();
        for(int i : str.keySet())
        {
            br.append(str.get(i));
        }
        
        return br.toString();
    }
}
