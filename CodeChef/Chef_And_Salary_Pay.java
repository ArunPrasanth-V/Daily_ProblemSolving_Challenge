/*Problem Discription :   https://www.codechef.com/START16C/problems/HCAGMAM1    */


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
	       int t=scan.nextInt();
	       for(int j=0;j<t;j++)
	       {
	           int actualSalary=scan.nextInt();
	           int bonous=scan.nextInt();
	           String days=scan.next();
	           int precon=0;
	           int currcon=0;
	           int present=0;
	         //  System.out.println(days.length());
	           for(int i=0;i<days.length();i++)
	           {
	             
	               char c=days.charAt(i);
	             
	               if(c=='1'){
	                  present++;
	                   currcon++;
	               }
	               else
	                {
	                    if(currcon>precon)
	                       precon=currcon;
	                 currcon=0;     
	                }
	             }
	             if(currcon>precon)
	                       precon=currcon;
	             present=present*actualSalary;
	             precon=precon*bonous;
	             System.out.println(present+precon);
	       }
	       // System.out.println("Arun");
	     }catch(Exception e){}
	}
}
