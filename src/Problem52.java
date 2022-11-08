//It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.
//Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
public class Problem52 {
    public static void main(String[] args) {
        System.out.println("Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.");
        System.out.println("Computer Says: ");
        int x = 1;
        while (true) {
            if (isPerm(x, x * 2) && isPerm(x, x * 3) && isPerm(x, x * 4) && isPerm(x, x * 5) && isPerm(x, x * 6)) {
                System.out.println(x);
                break;
            }
            x++;
        }
    }

    public static boolean isPerm(int x, int y) {
        String x1 = Integer.toString(x);
        String y1 = Integer.toString(y);
        if (x1.length() != y1.length())
            return false;
        for (int i = 0; i < x1.length(); i++) {
            if (y1.indexOf(x1.charAt(i)) == -1)
                return false;
        }
        return true;
    }
}
