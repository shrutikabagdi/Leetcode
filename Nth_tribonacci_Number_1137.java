package Leetcode;

import java.util.Scanner;

public class Nth_tribonacci_Number_1137 {

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int firstTerm = 0;
            int secondTerm = 1;
            int thirdTerm = 1;

            // start from 3
            for (int i = 3; i <= n; i++) {
                int fourthTerm = firstTerm + secondTerm + thirdTerm;

                firstTerm = secondTerm;
                secondTerm = thirdTerm;
                thirdTerm = fourthTerm;
            }
            return thirdTerm; // correct return
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Tribonacci Number = " + tribonacci(n));
    }
}
