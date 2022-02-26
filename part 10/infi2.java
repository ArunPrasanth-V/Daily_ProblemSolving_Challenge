import java.io.*;
import java.util.*;
import java.lang.Math;
class Solution {
    static ArrayList<Integer> arr=new ArrayList<>();
    public static int beautifulFunction(int n){
        if(arr.size()==0)
            arr.add(n);
        n++;
        while(n%10==0)
        {
            n/=10;
        }
        if(arr.contains(n))
            return arr.size();
        arr.add(n);
        return beautifulFunction(n);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int result;
        result = beautifulFunction(N);
        System.out.print(result);
        return ;
    }
}
