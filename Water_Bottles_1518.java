package Leetcode;
import java.util.Scanner;

public class Water_Bottles_1518 {

    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;

            ans = ans + newBottles;
            numBottles = newBottles + remBottles;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bottles: ");
        int numBottles = sc.nextInt();

        System.out.print("Enter exchange rate: ");
        int numExchange = sc.nextInt();

        Water_Bottles_1518 obj = new Water_Bottles_1518();
        int result = obj.numWaterBottles(numBottles, numExchange);

        System.out.println("Total bottles you can drink: " + result);
    }
}
