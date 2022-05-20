import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println(isvalid("arr","raa"));
       
    }
    public static boolean isvalid(String s1,String s2){
        boolean arr1[]=new boolean[256];
//boolean[] seats = new boolean[10];
        boolean arr2[]=new boolean[256];
        Arrays.fill(arr1, false);
        Arrays.fill(arr2, false);
        Map<Character,Character> map=new HashMap<>();
         Map<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
        if(arr1[s1.charAt(i)]==true ||  arr2[s2.charAt(i)]==true){
              if(arr1[s1.charAt(i)]==true)
              {
                  if(map.get(s1.charAt(i)) !=s2.charAt(i))
                  return false;
              }
              if(arr2[s2.charAt(i)]==true)
              {
                  if(map2.get(s2.charAt(i))!=s1.charAt(i)){
                      return false;
                  }
              }
            }
            arr1[s1.charAt(i)]=true;
            arr2[s2.charAt(i)]=true;
            map.put(s1.charAt(i),s2.charAt(i));
              map2.put(s2.charAt(i),s1.charAt(i));
        }
        return true;
    }
}
