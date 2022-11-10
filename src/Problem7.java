/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */
public class Problem7 {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        while(count < 10002){
            if (isPrime(i)){
                count++;
                System.out.println(count + ": " + i);

            }
            i++;
        }
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
