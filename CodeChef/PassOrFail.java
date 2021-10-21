/* Problem Statement : https://www.codechef.com/START16C/problems/PASSORFAIL  */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner scan =new Scanner(System.in);
		    int t =scan.nextInt();
		    for(int i=0;i<t;t++)
		    {
		        int subject=scan.nextInt();
		        int pass=scan.nextInt();
		        int p=scan.nextInt();
		        int fail=subject-pass;
		        pass*=3;
		        pass=pass-fail;
		        if(pass>=p)
		        {
		            System.out.println("PASS");
		        }
		        else
		        System.out.println("FAIL");
		        
		        
		        
		    }
		}catch(Exception e){}
	}
}
