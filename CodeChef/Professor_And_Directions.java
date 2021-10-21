/*
Problem Discription: https://www.codechef.com/START16C/problems/DIRECTN  
*/



import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner scan=new Scanner(System.in);
		    int t=scan.nextInt();
		    for(int i=0;i<t;i++)
		    {
		        int len=scan.nextInt();
		        String str=scan.nextLine();
		         String str1=scan.nextLine();
		      //  System.out.println(str1);
		        String s="NO";
		        if(str1.contains("LL")||str1.contains("RR"))
		          s="YES";
		        System.out.println(s);
		    }
		}
		catch(Exception e){}
	}
}
