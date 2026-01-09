package Leetcode;

public class Palindrome_Number_9 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int revNum = 0;

        while (n > 0) {
            int d = n % 10;
            revNum = revNum * 10 + d;
            n = n / 10;
        }
        return revNum == x;
    }

    public static void main(String[] args) {
        Palindrome_Number_9 obj = new Palindrome_Number_9();

        int input = 121;
        System.out.println(obj.isPalindrome(input));
    }
}
