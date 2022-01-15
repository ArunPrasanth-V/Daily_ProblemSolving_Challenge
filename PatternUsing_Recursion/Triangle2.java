/*

* * * * * 
* * * * 
* * * 
* * 
*

*/
class Pattern2 {
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
			System.out.print("* ");
			fun(row,++col);
		}
		else  
		{
			System.out.println();
			fun(--row,0);	
		}
		
	}
}
