/*Problem Discription:
    Given an array of integer we need to form the largest number from the array
    Input: nums = [10,2] Output: "210", Input: nums = [3,30,34,5,9]  Output: "9534330"
    1)convert it into String Array .
    2)by using comparator interface am creating anonymous class by lamda 
    3)sort the string using comparator. compareTO method is taking 2 input as( a+b ,b+a) return which is largest by "1(grater),-1(first no. is lesser),0(both are equal)"
    4)check whether the first element is 0 or not
    5) adding each array element into StringBuffer because StringBuffer is mutable.
    6)finally return the StringBuffer as String.
*/

class Form_Largest_Number_From_Integer {
    public String largestNumber(int[] nums) {
        if(nums.length==0)
            return "0";
        String []s=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            s[i]=nums[i]+"";
        }
        Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b));
        //     (s,new Comparator<String>(){
        //    public int compare(String s1,String s2)
        //    {
        //        String o1=s1+s2;
        //        String o2=s2+s1;
        //        return o2.compareTo(o1);
        //    }
        // });
        if(s[0].equals("0"))
            return "0";
        StringBuffer bf=new StringBuffer();
        for(String ss:s)
            bf.append(ss);
        
        return bf.toString();
    }
}
