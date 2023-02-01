//problem link : https://leetcode.com/problems/different-ways-to-add-parentheses/description/
class Solution {
    Set<Character> symbols=new HashSet<>();
    Map<String,List<Integer>> cache=new HashMap<>();
    String value;
    public List<Integer> diffWaysToCompute(String expression) 
    {
        value = expression;
         symbols.add('+');
         symbols.add('-');
         symbols.add('*');
        return calculate(0,expression.length()-1);
    }
    public String getKey(int a,int b)
    {
            return a+","+b;
    }
    public List<Integer> calculate(int start,int end)
    {
        String key=getKey(start,end);
        if(cache.containsKey(key))
        {
            return cache.get(key);
        }
        LinkedList<Integer> store=new LinkedList<>();
        for(int i=start;i<end;i++)
        {
            if(symbols.contains(value.charAt(i)))
            {
                List<Integer> leftpart=calculate(start,i-1);
                List<Integer> rightpart=calculate(i+1,end);
                for(Integer l:leftpart)
                {
                    for(Integer r:rightpart)
                    {
                        store.add(compute(l,r,value.charAt(i)));
                    }
                }
            }
        }
        if(store.size()==0)
        {
            store.add(Integer.parseInt(value.substring(start,end+1)));
        }
        cache.put(key,store);
        return store;
    }
    public int compute(int a,int b,char symbol)
    {
        switch(symbol)
        {
            case '+':
                        return a+b;
            case '-':
                        return a-b;
            case '*':
                        return a*b;
        }
        return -1;
    }
}
