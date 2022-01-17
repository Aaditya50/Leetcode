class Solution {
    public double largestTriangleArea(int[][] points) {
        double result = 0;
        int n = points.length;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                for(int k=j+1;k<n;k++){
                    double area = 0;
                    int[] a = points[i];
                    int[] b = points[j];
                    int[] c = points[k];
                    area = Math.abs(area(a,b)+area(b,c)+area(c,a));
                    if(area>result)
                        result = area;
                }
        return result;
    }
    
    public double area(int[] a , int[] b){
        int l = b[0]-a[0];
        double h = (a[1]+b[1]+200)/2.0;
        return l*h;
    }
}

/*
Example 1:


Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
Output: 2.00000
Explanation: The five points are shown in the above figure. The red triangle is the largest.


Example 2:

Input: points = [[1,0],[0,0],[0,1]]
Output: 0.50000
*/
