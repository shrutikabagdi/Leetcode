package Leetcode;
public class Arranging_Coins_441 {
    public int arrangeCoins(int n) {
        int row = 1;
        int count = 0;
        while (n >= row) {
            n = n - row;
            count++;
            row++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 5;
        Arranging_Coins_441 obj = new Arranging_Coins_441();
        System.out.println(obj.arrangeCoins(n));
    }
}










