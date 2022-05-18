import java.util.*;
public class PrintLargeDigit {
// 67845 -> 8 - 1
 // 67845554 ->  5-3
	public static void main(String[] args) {
	  int a =67845;
	 Map<Integer,Integer> ans=new HashMap<>();
	  while(a>0) {
		  int num=a%10;
		  a=a/10;
		  if(ans.containsKey(num)) {
			  ans.put(num,ans.get(num)+1);
		  }
		  else {
			  ans.put(num,1);
		  }
	  }
	int max=0;
	int index=-1;
	  for (Integer name: ans.keySet()) {
		  if(max<=ans.get(name)) {
			  index=name;
			  max=ans.get(name);
		  }
		}
	  System.out.println(index +"---> "+max);
	}

}
