import java.util.HashSet;
import java.util.Scanner;

public class JewelsAndStones_771 {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();

        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        int count = 0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter jewels string: ");
        String jewels = sc.nextLine();

        System.out.print("Enter stones string: ");
        String stones = sc.nextLine();

        JewelsAndStones_771 obj = new JewelsAndStones_771();
        System.out.println("Number of jewels in stones = " +
                obj.numJewelsInStones(jewels, stones));
        sc.close();
    }
}
