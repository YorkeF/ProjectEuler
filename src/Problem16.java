/*


215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?

 */

import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args) {
        BigInteger total = BigInteger.valueOf(2).pow(1000);
        String[] digits = total.toString().split("");
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Integer.parseInt(digits[i]);
        }
        System.out.println(sum);
    }
}
