/*
It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.
Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
 */
public class Problem52 {
    public static void main(String[] args) {
        int x = 1;
        while (!(isSameNumbers(x, x * 2) && isSameNumbers(x, x * 3) && isSameNumbers(x, x * 4) && isSameNumbers(x, x * 5) && isSameNumbers(x, x * 6))) {
            System.out.println(x + ", " + isSameNumbers(x, x * 2) + ", " + isSameNumbers(x, x * 3) + ", " + isSameNumbers(x, x * 4) + ", " + isSameNumbers(x, x * 5) + ", " + isSameNumbers(x, x * 6));
            x++;
        }
        System.out.println(x + ": " + isSameNumbers(x, x * 2) + ", " + isSameNumbers(x, x * 3) + ", " + isSameNumbers(x, x * 4) + ", " + isSameNumbers(x, x * 5) + ", " + isSameNumbers(x, x * 6));
        System.out.println("\nThe solution is: " + x);
    }

    public static boolean isSameNumbers(int input, int input2) {
        String x1 = Integer.toString(input);
        String y1 = Integer.toString(input2);

        if (x1.length() != y1.length()){
            return false;
        }
        for (int i = 0; i < x1.length(); i++) {
            if (y1.indexOf(x1.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
