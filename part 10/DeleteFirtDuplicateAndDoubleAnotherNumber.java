package module1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteFirtDuplicateAndDoubleAnotherNumber {
public static int numofOperation(int n,List<Integer> arr)
{
	int count=0;
	for (int i = 0; i < arr.size(); i++)   
	{
		for (int j = i+1; j <arr.size(); j++)   
		{
			if(arr.get(i)==arr.get(j) &&
					arr.get(i)!=-1 &&
					arr.get(j)!=-1)
			{
				arr.set(j,arr.get(j)*2);
				arr.set(i,-1);
				count++;
			}
		}
	}
	return count;
}
	public static void main(String[] args) {
		
		List<Integer> arr=new ArrayList<>();
		//System.out.println(arr);
		arr.add(1);
		arr.add(1);
		arr.add(4);
		arr.add(2);
		System.out.println(numofOperation(4,arr));
	}

}
