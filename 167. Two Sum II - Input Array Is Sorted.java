class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int m = 0;
        int n = numbers.length-1;
        while(m<=n){
            int sum = numbers[n]+numbers[m];
            if(sum > target){
                n--;
            }else if(sum < target){
                m++;
            }else{
                return new int[]{m+1,n+1};
            }
        }
         return new int[]{m+1,n+1};
    }
}

/*
Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].

*/
