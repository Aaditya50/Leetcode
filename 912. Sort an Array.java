class Solution {
    public int[] sortArray(int[] nums) {
        int[] arr = MergeSort(nums,0,nums.length-1);
        return arr;
    }
    public int[] MergeSort(int[] nums,int left,int right){
        if(left==right){
            int[] ans = new int[1];
            ans[0]=nums[left];
            return ans;
        }
        int mid = (left+right)/2;
        int[] a1= MergeSort(nums,left,mid);
        int[] a2= MergeSort(nums,mid+1,right);
        int[] ans = MergeTwoSortedArrays(a1,a2);
        return ans;
    }

    public int[] MergeTwoSortedArrays(int[] arr1,int[] arr2){
        int i=0,a1=arr1.length;
        int j=0,a2=arr2.length;
        int k=0;
        int[] ans = new int[a1+a2];
        while(i<a1 && j<a2){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
            }else{
                ans[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<a1){
            ans[k]=arr1[i];
            i++;k++;
        }
        while(j<a2){
            ans[k]=arr2[j];
            k++;j++;
        }
        return ans;
    }
    
    
}
