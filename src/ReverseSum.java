import java.util.Scanner;

/*
    Given a positive number, print the sum of reverse of the number with the given number.
    When reversing the number do not reverse the position of trailing 0's.
    The trailing 0's should stay at the place they are at.

    Example:
    Input: 1230
    Output: 4440

    Explanation: Reverse of 1230 should be 3210. So, the sum is 1230 + 3210 = 4440.
 */

// Solution
public class ReverseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = print_reverse_sum(num);
        System.out.println(sum);
    }

    private static int print_reverse_sum(int n) {
        int temp = n;
        int zero = 0;
        if (temp%10 == 0){
            while (temp%10 == 0){
                zero++;
                temp = temp/10;
            }
        }
        System.out.println(temp);
        int reversed = 0;
        while(temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println(reversed);
        if (zero != 0) reversed = Integer.parseInt(reversed + "" + 0*zero);
        return reversed + n;
    }

}
