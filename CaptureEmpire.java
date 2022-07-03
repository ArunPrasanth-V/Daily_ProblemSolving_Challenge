import java.util.*;

public class CaptureEmpire {

	public static void main(String[] args) {
		int ans=interpret(new int[]{1,1,1});
		System.out.println(ans);
	}
	
	  public static int interpret(int[]A) {
			       Map<Integer,Integer> map=new HashMap<>();
			       Arrays.sort(A);
			       for(int i:A){
			           int v= map.getOrDefault(i,0);
			            map.put(i,v+1);
			        }
			        int day=0;
			        int x=0;
			        for(int i=0;i<A.length;i++){
			            int troop=++x;
			            day++;
			            if(Teamcontains(troop,map)!=0) {	
		                }
		                else 
		                {
				             while(A[i]>troop){
				            	 day++;
					             troop+=x;
					                if(Teamcontains(troop,map)!=0) {              	
					                	break;
					                }
					                else if(checkBetweenRange(troop-x,troop,map)!=0) {
					                	break;
					                }
					                
					            }
		                }
			        }
			        return day;
	    }
	  
	  public static int Teamcontains(int val ,Map<Integer,Integer>map) {
		  int c=map.getOrDefault(val,0);
		  if(c!=0) {
			  map.put(val,--c);
			  return c+1;
		  }
		  return 0;
	  }
	  public static int checkBetweenRange(int start,int end ,Map<Integer,Integer>map) {
		  for(int i=start;i<end;i++) {
			int c  =map.getOrDefault(i,0);
			if(c!=0)
			{
				map.put(i,--c);
				return c+1;
			}
				
		  }
		  return 0;
	  }
}
