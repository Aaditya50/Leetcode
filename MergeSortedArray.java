class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int i = 0, j = 0 , k = 0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                res[k] = nums1[i];
                i++;k++;
            }else{
                res[k] = nums2[j];
                j++;k++;
            }
        }
        while(i<m){
            res[k] = nums1[i];
            i++;k++;
        }
        while(j<n){
            res[k] = nums2[j];
            j++;k++;
        }
        for(int q=0;q<nums1.length;q++){
            nums1[q] = res[q];
        }
    }
}
