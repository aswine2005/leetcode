import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        // Check each element in the array if it's a palindrome
        System.out.println("Palindrome check for each element:");
        for (int i = 0; i < n; i++) {
            if (isPalindrome(x[i])) {
                System.out.println(x[i] + " is a palindrome.");
            } else {
                System.out.println(x[i] + " is not a palindrome.");
            }
        }
        
        sc.close();
    }

    // Method to check if a given integer is a palindrome
    public static boolean isPalindrome(int x) {
        // A negative number cannot be a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;
        
        // Reverse half of the number
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        // Check if the original number is equal to the reversed number
        return x == reversed || x == reversed / 10;
    }
}
 