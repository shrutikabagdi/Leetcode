package Leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Add_To_Array_Form_Interger_989 {

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length - 1;
        int carry = 0;

        while (p >= 0 || k > 0) {
            int numval = 0;
            if (p >= 0) {
                numval = num[p];
            }
            int d = k % 10;
            int sum = numval + d + carry;

            ans.add(sum % 10);
            carry = sum / 10;

            p--;
            k = k / 10;
        }

        if (carry > 0) {
            ans.add(carry);
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter integer k: ");
        int k = sc.nextInt();

        Add_To_Array_Form_Interger_989 obj = new Add_To_Array_Form_Interger_989();
        List<Integer> result = obj.addToArrayForm(num, k);

        System.out.println("Output: " + result);
    }
}
