import java.util.*;
public class SortAccordingTONumber {

	public static void main(String[] args) {
		int arr[]= {1,1,2,3,1,2,5,5,5,5,5,5,5,4,3,1,1};
		Map<Integer,Integer> map=new HashMap<>();
		Map<Integer,Boolean> visited=new HashMap<>();
		for(int i:arr) {
			int c=map.getOrDefault(i,0);
			map.put(i,++c);
			visited.put(i,false);
		}
		
		int val=0;
		for(int i=0;i<map.size();i++) {
			int min=Integer.MAX_VALUE;
			for(Integer j:map.keySet()) {
				if(!visited.get(j) && min>=map.get(j)) {
					val=j;
					min=map.get(j);
				}
			}
			visited.put(val,true);
			for(int k=0;k<map.get(val);k++) {
				System.out.print(val+" ");
			}
		}
	}

}
