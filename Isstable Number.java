public static boolean is(int a) {
		Map<Integer,Integer> map=new HashMap<>();
		int val=a%10;
		while(a>0) {
			int t=0;
			if(map.containsKey(a%10)) {
				t=map.get(a);
			}
			
			map.put(a%10,t+1);
			a/=10;
		}
		val=map.get(val);
		for(int q:map.keySet()) {
			if(map.get(q)!=val)
				return false;
		}
		return true;
	}
