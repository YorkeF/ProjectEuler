/*
The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */
import java.math.BigInteger;
public class Problem48 {
    public static void main(String[] args) {
        BigInteger total = BigInteger.valueOf(0);
        BigInteger current;
        for (int i = 1; i < 1001; i++) {
            current = BigInteger.valueOf(i).pow(i);
            total = total.add(current);
        }
        total = total.mod(BigInteger.valueOf(1000000000).multiply(BigInteger.valueOf(10)));
        System.out.println(total);
    }
}
