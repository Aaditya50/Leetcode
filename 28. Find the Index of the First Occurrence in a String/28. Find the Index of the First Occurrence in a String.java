class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        return (int)haystack.indexOf(needle);
    }
}
