// 1323. Maximum 69 Number
// https://leetcode.com/problems/maximum-69-number/
class Solution {
    public int maximum69Number (int num) {
        StringBuilder br=new StringBuilder();
        br.append(num+"");
        for(int i=0;i<br.length();i++){
            if (br.charAt(i)!='9')
            {
                br.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(br.toString());
    }
}
