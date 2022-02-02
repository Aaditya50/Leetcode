class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int s = m+n;
        int[] ans = new int[s];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                ans[k++] = nums1[i++];
            }else{
                ans[k++] = nums2[j++];
            }
        }
        while(i<m){
            ans[k++] = nums1[i++];
        }
        while(j<n){
            ans[k++] = nums2[j++];
        }
        
        double med = 0;
        if(ans.length%2 != 0){
            int x = ans.length/2;
            med = ans[x];
        }else{
            int x = ans.length/2-1;
            int y = ans.length/2;
            med = (ans[x]+ans[y])/2.0;
        }
        return med;
        
        //OR
        /*
        if(s%2 != 0){
            return ans[s/2];
        }else{
            return (ans[(s/2)-1]+ans[s/2])/2.0;
        }*/
    }
}
