/*
The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?


 */

import java.util.*;
import java.math.BigInteger;
public class Problem25 {
    public static void main(String[] args) {
        System.out.println("What is the index of the first term in the Fibonacci sequence to contain 1000 digits?\n");
        System.out.println("Computer Says: ");
        List<BigInteger> list = new ArrayList<>();
        BigInteger first = BigInteger.valueOf(1);

        int digit = 0;
        list.add(BigInteger.valueOf(1));
        //System.out.println("Index " + (digit + 1) + ", Length "+ lengthOf(list.get(digit)) + ": " + list.get(digit));
        digit++;
        list.add(BigInteger.valueOf(1));
        //System.out.println("Index " + (digit + 1) + ", Length "+ lengthOf(list.get(digit)) + ": " + list.get(digit));
        digit++;
        while(lengthOf(list.get(list.size()-1)) < 1000){
            list.add(list.get(digit - 1).add(list.get(digit - 2)));
            //System.out.println("Index " + (digit + 1) + ", Length "+ lengthOf(list.get(digit)) + ": " + list.get(digit));
            digit++;
        }
        System.out.println(digit);
    }

    public static int lengthOf(BigInteger num){
        int length= 0;
        length = num.toString(10).length();
        return length;
    }
}