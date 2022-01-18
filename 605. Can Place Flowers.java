class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
       
        int m = a.length;
        int c = 0;
        for(int i=0;i<m;i++){
            if(a[i] == 0 && (i==0 || a[i-1] == 0) && (i == m-1 || a[i+1] == 0 )){
                c++;
                a[i]=1;
            }
        }
        return  c>=n?true:false;
    }
}
