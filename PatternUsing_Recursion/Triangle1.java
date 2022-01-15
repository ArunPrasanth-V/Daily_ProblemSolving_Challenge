/*

* 
* * 
* * * 
* * * * 
* * * * * 

*/
public class Pattern1 {
	public static void main(String args[])
	{
	   	fun(5,0);
	}
	static void fun(int row , int col)
	{
		if(row==0)
			return;
		if(row>col) 
		{
			fun(row,++col);
			System.out.print("* ");
		}
		else  
		{
			fun(--row,0);
			System.out.println();
		}
		
	}
}
