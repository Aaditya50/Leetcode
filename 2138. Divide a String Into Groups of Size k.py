class Solution:
    def divideString(self, s: str, k: int, fill: str) -> List[str]:
        a=[s[i:i+k] for i in range(0,len(s),k)]
        if len(a[-1])!= k:
            b= a[-1]
            b+=fill*(k-len(a[-1]))
            for i,x in enumerate(a):
                if i==len(a)-1:
                    a[i]=b
        return (a)
