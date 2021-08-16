/*   Problem Description :
        Given an array we need to find longest prefix in that array. 
        Input: strs = ["flower","flow","flight"]
        Output: "fl" 
        
        Base condition "if tne length is 0 means no element in a array so, i written empty String "
        1)i'm storing 1st array element(0th index) srting in new string .
        2)creating for loop for iterating each element in an array start from the 1.( why no 0 means am storing oth index element only ir remins the same).
        3)am using indexOf() method to check wether the current array element is present in the string or not.
        4) if not means am just decrementing by 1 in length of new String.
        5)Repeating the same process util the new string matches the substring of specfic array element.
        6)Finally, return the string.

*/

class Longest_Common_prefixArray {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        String s=strs[0];
        for(int i=1;i<strs.length;i++){
              while(strs[i].indexOf(s)!=0)//it check "s" is a substring of "str[i]". NO means go inside and decrement the new string by 1 and agin check
                  s=s.substring(0,s.length()-1);
         }
        return s;
    }
}
