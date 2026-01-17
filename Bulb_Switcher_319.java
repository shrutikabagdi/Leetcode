package Leetcode;
import java.util.Scanner;

public class Bulb_Switcher_319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bulbs (n): ");
        int n = sc.nextInt();
        Bulb_Switcher_319 obj = new Bulb_Switcher_319();
        int result = obj.bulbSwitch(n);
        System.out.println("Number of bulbs ON: " + result);
    }
    public int bulbSwitch(int n) {
        int count = 0;
        int i = 1;
        while(i * i <= n){
            count++;
            i++;
        }
        return count;
    }
}
