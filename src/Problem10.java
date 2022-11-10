/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */

public class Problem10 {
    public static void main(String[] args) {
        long total = 2;
        //takes about 45 seconds
        for (int i = 3; i < 2000000; i+=2) {
            if (isPrime(i)){
                total += i;
            }
        }
        System.out.println(total);
    }
    public static boolean isPrime(int input){
        for(int i = 2; i < input; i++){
            if(input % i == 0){
                return false;
            }
        }
        return true;
    }
}
