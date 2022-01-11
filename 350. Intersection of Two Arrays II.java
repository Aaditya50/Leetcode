class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int s1 = nums1.length;
        int s2 = nums2.length;

        int[] ans = new int[s1+s2];
        int i=0,j=0,k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<s1 && j<s2){
            if(nums1[i] < nums2[j]) {
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                ans[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(ans,0,k);
    }
}

/*
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
*/
