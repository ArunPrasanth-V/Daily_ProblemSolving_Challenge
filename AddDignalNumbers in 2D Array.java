class Main
{
	public static void main(String[] args) {
	   
	   int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	   int x=3;
	   for(int i=0;i<a.length;i++)
	   {
	      System.out.print(addDignal(0,i,a)+" ");
	   }
	   int level=1;
	   while(level<x)
	   {
	     System.out.print(addDignal(level,x-1,a)+" ");
	     level++;
	   }
	}
	public static int addDignal(int x,int y,int a[][])
	{
	    int sum=0;
	    while(y>=0 && x<a.length)
	    {
	        sum+=a[x][y];
	        x++;
	        y--;
	    }
	    return sum;
	}
}
