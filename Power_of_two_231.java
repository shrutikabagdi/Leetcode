package Leetcode;

import java.util.Scanner;

public class Power_of_two_231 {

    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            while (n % 2 == 0) {
                n = n / 2;
            }
            return n == 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Power_of_two_231 obj = new Power_of_two_231();
        System.out.println(obj.isPowerOfTwo(n));

        sc.close();
    }
}
