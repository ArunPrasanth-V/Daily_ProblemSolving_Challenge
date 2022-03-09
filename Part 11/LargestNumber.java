// 179. Largest Number
// https://leetcode.com/problems/largest-number/
class Solution {
    public String largestNumber(int[] arr) {
    String result=Arrays.stream(arr)
			      .mapToObj(String::valueOf)
			      .sorted((i,j)->(j+i).compareTo(i+j))
			      .collect(Collectors.joining());
	return (result.startsWith("0")?"0":result);

    }
}



