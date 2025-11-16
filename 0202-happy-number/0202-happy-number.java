//This is hashset code:
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


//---------------------------------------------------------------------------------------------------------------------------
// The two pointer code is given below:

// class Solution {
//     public boolean isHappy(int n) {
//         int slow = n;
//         int fast = n;

//         do {
//             slow = sumOfSquares(slow);
//             fast = sumOfSquares(sumOfSquares(fast));
//         } while (slow != fast);

//         return slow == 1;
//     }

//     private int sumOfSquares(int number) {
//         int sum = 0;
//         while (number > 0) {
//             int digit = number % 10;
//             sum += digit * digit;
//             number /= 10;
//         }
//         return sum;
//     }
// }
