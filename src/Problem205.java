/*
Peter has nine four-sided (pyramidal) dice, each with faces numbered 1, 2, 3, 4.
Colin has six six-sided (cubic) dice, each with faces numbered 1, 2, 3, 4, 5, 6.

Peter and Colin roll their dice and compare totals: the highest total wins. The result is a draw if the totals are equal.

What is the probability that Pyramidal Pete beats Cubic Colin? Give your answer rounded to seven decimal places in the form 0.abcdefg
 */


import java.math.BigInteger;
import java.util.Random;

public class Problem205 {
    public static void main(String[] args) {
        BigInteger cubewins = BigInteger.ZERO;
        BigInteger triwins = BigInteger.ZERO;
        double odds = 0;
        BigInteger total = BigInteger.ZERO;
        int triroll;
        int cuberoll;
        int truecount=0;

        while(truecount < 10000){
            triroll = rolld4();
            cuberoll = rolld6();
            if(cuberoll < triroll){
                triwins = triwins.add(BigInteger.ONE);
            }
            if (triroll < cuberoll){
                cubewins = cubewins.add(BigInteger.ONE);
            }
            total = total.add(BigInteger.ONE);
            odds = (double) triwins.intValue() / (double) total.intValue();
            if(total.intValue() % 100000 == 0){
                System.out.print(".");
            }
            if(total.intValue() % 10000000 == 0) {
                truecount++;
                System.out.println("\nTimes d4 has won: "+ triwins + ", Times d6 has won: " + cubewins + ", Total Rolls: " + total + ", Odds of d4 Winning: " + odds);
            }
        }
        System.out.println("Finished");

    }

    public static int rolld4(){
        Random rand = new Random();
        int roll = rand.nextInt(1,5) + rand.nextInt(1,5) + rand.nextInt(1,5) +
                rand.nextInt(1,5) + rand.nextInt(1,5) + rand.nextInt(1,5) +
                rand.nextInt(1,5) + rand.nextInt(1,5) + rand.nextInt(1,5);
        return roll;
    }
    public static int rolld6(){
        Random rand = new Random();
        int roll = rand.nextInt(1,7) + rand.nextInt(1,7) + rand.nextInt(1,7) +
                rand.nextInt(1,7) + rand.nextInt(1,7) + rand.nextInt(1,7);
        return roll;
    }
}
