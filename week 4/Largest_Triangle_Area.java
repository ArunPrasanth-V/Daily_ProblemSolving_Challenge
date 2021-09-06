/*Problem Discription :
          Given array of co-ordinate we have to find largest triangle amoung the co-ordinates
         Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]  Output: 2.00000
         Explanation: The five points are shown in the above figure. The red triangle is the largest.
         1)inside a for loop am going to parse each element
         2)then finding triangle using formula "x1(y2-y1) -x2(y1-y2)+x3(y1-y2)  "
         3)and compare with max 
         4)finally return the max element.
*/
class Largest_Triangle_Are {
    public double largestTriangleArea(int[][] points) {
        double max=0;
      int len=points.length;
        for(int ft=0;ft<len-2;ft++)
        {
            for(int sd=ft+1;sd<len-1;sd++)
            {
                for(int td=sd+1;td<len;td++)
                {
                   double area=findIt( points[ft], points[sd], points[td]);
                    max=Math.max(area,max);
                 }
        
             }
        }
        return max;
    }
    public double findIt(int[]a,int[]b,int[]c){
        double d=(a[0]*(b[1]-c[1])
                 -b[0]*(a[1]-c[1])
                 +c[0]*(a[1]-b[1]))/2.0;
        return d > 0 ? d : -d;
    }
}
