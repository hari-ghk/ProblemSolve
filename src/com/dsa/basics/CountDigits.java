package com.dsa.basics;

public class CountDigits {
    //Time Complexity - O(log10(number)) -> O(D)
    public static void main(String[] args){
        System.out.println("The number of digits in 0 are: "+ countDigit(0));
        System.out.println("The number of digits in 124 are: "+ countDigit(124));
        System.out.println("The number of digits in 12400 are: "+ countDigit(12400));
        System.out.println("The number of digits in 4000 are: "+ countDigit(4000));
        System.out.println("The number of digits in 8090 are: "+ countDigit(8090));
        System.out.println("The number of digits in 100000000 are: "+ countDigit(100000000));
        System.out.println("The number of digits in 100000000 are: "+ countDigitLog(100000000));
    }

    private static int countDigit(int n) {

        if(n == 0)
            return 1;

        else {
            int count = 0;
            while(n > 0){
                ++count;
                n = n / 10;
            }
            return count;
        }
    }

    private static int countDigitLog(int n) {
        return (int) Math.log10(n)+1;
    }
}
