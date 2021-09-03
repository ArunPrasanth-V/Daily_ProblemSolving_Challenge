/* Problem Description :
    Given a number we have to find whether each digit in that number is divisble by that number and remainder is 0. then add it into arraylist
    For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0
     1)Traversing each number in a for loop
     2)calling a method it check whether the given is divisible by itself or not.
     3)In that method it accept whole number parse single digit in the loop check it is divisible or not 
     4)if it is yes mean continue else return false.
     5)finally it return the ArrayList.
    
*/
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> adding=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(checkRight(i))
                adding.add(i);
        }
        return adding;
    }
    public static boolean checkRight(int num)
    {
        for(char c:String.valueOf(num).toCharArray())
        {
            if(c=='0'||(num %(c-'0')>0))
                return false;
        }
        return true;
    }
} 
