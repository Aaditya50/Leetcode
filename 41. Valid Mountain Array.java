class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int i = 0 , j = arr.length-1;
        while(i+1 < arr.length-1 && arr[i]<arr[i+1]) i++;
        while(j-1 > 0 && arr[j]<arr[j-1]) j--;
        return i==j;
    }
}
