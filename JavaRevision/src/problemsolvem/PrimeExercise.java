/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvem;

/**
 *
 * @author HusseinATejan
 */
public class PrimeExercise {

    public static boolean isPrime(int n) {
        //check if n is a multiple of 2
        if ((n!=2) && (n % 2 == 0)) {
            return false;
        }
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 2;
//        checkPrime(n);
        System.out.println(isPrime(n));

    }
    public static void checkPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i < n; i++) 
        {
            //can i go into n? if it can then it is not a prime number so come out of the if statement
            if (n % i == 0) 
            {
                isPrime = false;
                break;
            }
        }
        
        //if the boolean is true, i cannot go into n, hence it is true that n is a prime number
        if (isPrime) 
        {
            System.out.println(n + " is a Prime Number!");
        } 
        //if the boolean is false, i can go into n, hence it is false that n is a prime number
        else 
        {
            System.out.println(n + " is not a Prime Number!");

        }

    }

}
