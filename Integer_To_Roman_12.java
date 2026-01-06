package Leetcode;
public class Integer_To_Roman_12 {
    public static void main(String[] args) {
        Integer_To_Roman_12 obj = new Integer_To_Roman_12();
        int num = 1994;
        String result = obj.intToRoman(num);
        System.out.println("Roman Number: " + result);
    }
    public String intToRoman(int num) {
        int[] intCode = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] code = {
                "M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"
        };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intCode.length; i++) {
            while (num >= intCode[i]) {
                sb.append(code[i]);
                num -= intCode[i];
            }
        }
        return sb.toString();
    }
}
