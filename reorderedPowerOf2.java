class Solution {
    public boolean reorderedPowerOf2(int n) {
        // Get the digit frequency of n
        int[] countN = countDigits(n);
        
        // Check powers of two from 2^0 to 2^30 (since max n = 10^9)
        for (int i = 0; i < 31; i++) {
            int powerOfTwo = 1 << i;
            if (Arrays.equals(countN, countDigits(powerOfTwo))) {
                return true;
            }
        }
        return false;
    }
    
    // Helper function to count digit frequencies in an integer
    private int[] countDigits(int num) {
        int[] count = new int[10];
        while (num > 0) {
            count[num % 10]++;
            num /= 10;
        }
        return count;
    }
}
