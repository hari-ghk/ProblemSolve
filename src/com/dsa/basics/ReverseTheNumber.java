package com.dsa.basics;

public class ReverseTheNumber {

    public static void main(String[] args) {
        System.out.println("The reversed number is: " + reverse(-421));
        System.out.println("The reversed number is: " + reverse(1534236469));
    }

    public static int reverse(int x) {
        int reversedNumber = 0;
        boolean isLessThanZero = false;
        isLessThanZero = (x < 0) ? true : false;
        x = Math.abs(x);
        try{
            while(x > 0){
                reversedNumber = Math.addExact(Math.multiplyExact(reversedNumber, 10), (x % 10));
                x = x / 10;
            }
        } catch(ArithmeticException e){
            return 0;
        }
        return isLessThanZero ? -reversedNumber : reversedNumber;
    }
}
