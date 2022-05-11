class Solution {
    public int countVowelStrings(int n) {
        int a = 1 , e = 1 , i =1 , o = 1, u = 1;
        while(n-- > 1){
            a = a+e+i+o+u;
            e = e+i+o+u;
            i = i+o+u;
            o = o+u;
            u = u;
        }
        return a+e+i+o+u;
    }
}


/*
For n = 1 : a , e , i, o, u
String starting with a = 1, e = 1, i = 1, o = 1, u = 1 : Total = 5

For n = 2 : aa, ae, ai, ao, au, ee, ei, eo, eu, ii, io, iu, oo, ou, uu
String starting with a = 5, e = 4, i = 3, o = 2, u = 1 : Total = 15

For n = 3 : aaa, aae, aai, aao, aau, aee, aei, aeo, aeu, aii, aio, aiu, aoo, aou, auu, eee, eei, eeo,eeu,eii, eio, eiu, eoo, eou, euu, iii, iio, iiu, ioo, iou, iuu, ooo, oou, ouu, uuu : Total = 35

On carefully observing :
For n = 2 : All the sequence formed count is equal to sum of previous sequences (i.e. n = 1) starting with a, e, i, o, u
a = a + e + i + o + u (1 + 1 + 1 + 1+ 1) = 5
e = e + i + o +u (1 + 1+ 1+ 1) = 4
i = i + o + u (1 + 1 + 1) = 3
o = o + u ( 1 + 1) = 2
u = u (1) = 1
Total = a + e + i + o + u = 5 + 4 + 3 + 2 + 1 = 15

For n = 3: All the sequence formed count is equal to sum of previous sequences (i.e. n = 2) starting with a, e, i, o, u
a = a + e + i + o + u (5 + 4 + 3 + 2+ 1) = 15
e = e + i + o +u (4 + 3+ 2+ 1) = 10
i = i + o + u (3 + 2 + 1) = 6
o = o + u ( 2 + 1) = 3
u = u (1) = 1
Total = a + e + i + o + u = 15 + 10 + 6 + 3 + 1 = 35
*/
