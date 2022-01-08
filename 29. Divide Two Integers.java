class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend >= Integer.MAX_VALUE) {
            if (divisor == 1) {
                return Integer.MAX_VALUE;
            }
            if (divisor == -1) {
                return Integer.MIN_VALUE;
            }
        }
        if (dividend <= Integer.MIN_VALUE) {
            if (divisor == 1) {
                return Integer.MIN_VALUE;
            }
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }
        return dividend/divisor;
    }
}
