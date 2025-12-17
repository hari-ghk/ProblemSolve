package com.dsa.basics;

public class PrimeNumbers {

    static void main(){
       System.out.println("1 is prime number: "+ isPrime(1));
       System.out.println("5 is prime number: "+ isPrime(5));
       System.out.println("8 is prime number: "+ isPrime(8));
    }

    public static boolean isPrime(int n) {
        if(n <=1)
            return false;
        for(int i = 2; i * i <= n; ++i){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

