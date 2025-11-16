class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1) {
            if (seen.contains(n)) {         // Here we can use seen.contains for detect the loop
                return false;               // detect the loop
            }
            seen.add(n);
            n = sumOfSquares(n);
        }
        return true;
    }
    private int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}