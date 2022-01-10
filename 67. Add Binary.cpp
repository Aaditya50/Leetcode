class Solution {
public:
    string addBinary(string a, string b) {
        string result ="";
        
        int sum=0, i= a.size()-1 ,j= b.size()-1;
        while(i>=0 || j>=0 || sum==1)
        {
            sum +=((i>=0)? a[i]-'0':0);
            sum +=((j>=0)? b[j]-'0':0);
            
            result = char(sum%2+'0')+ result;
            
            sum /=2;
            i--;j--;        
        }
        return result;
    }
};

/*
Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/
