class Solution:
    def countElements(self, nums: List[int]) -> int:
        p = len(nums)
        maxno = max(nums)
        minno = min(nums)
        count = 0
        for x in nums :
            if x>minno and x<maxno:
                count+=1
        return count
