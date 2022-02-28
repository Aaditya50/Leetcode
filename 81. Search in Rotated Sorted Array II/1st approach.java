class Solution {
    public boolean search(int[] nums, int target) {
        int i=getPivot(nums);
        
        if (nums[nums.length - 1] >= target) return binarySearch(nums, i, nums.length - 1, target);
        return binarySearch(nums, 0, i - 1, target);
    }
    static boolean binarySearch(int[] nums, int i, int j, int target) { //normal binary search(when elements are repeated without rotation)
        while (i <= j) {
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
            while (j - 1 >= 0 && nums[j] == nums[j - 1]) j--;
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] > target) j = mid - 1;
            else i = mid + 1;
        }
        return false;
    }
    static int getPivot(int[] nums){ // function to find the pivot or minimum element in rotated array
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
            while (j - 1 >= 0 && nums[j] == nums[j - 1]) j--;
            int mid = i + (j - i) / 2;
            if (nums[j] < nums[mid]) i = mid + 1;
            else j = mid;
        }
        return i;
    }
}
