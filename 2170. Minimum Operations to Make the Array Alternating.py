class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        h = {}
        sol=0
        n = len(nums)
        for i in range(0,n,2):
            if nums[i] in h:
                h[nums[i]] +=1
            else :
                h[nums[i]] = 1
        h1 = {} 
        
        for i in range(1,n,2):
            if nums[i] in h1:
                h1[nums[i]] +=1
            else :
                h1[nums[i]] = 1
                
        sum1 = sum(h.values())
        sum2 = sum(h1.values())
        
        hm1 = [(k,h[k]) for k in h.keys()]
        hm2 = [(k,h1[k]) for k in h1.keys()]
        
        hm1 = sorted(hm1, key= lambda x:x[1] , reverse=True)
        hm2 = sorted(hm2, key= lambda x:x[1] , reverse=True)
        
        for i in hm1:
            for j in hm2:
                if (i[0]!=j[0]):
                    return sum1-i[1] + sum2-j[1]
        return min(sum1,sum2)
