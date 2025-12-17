package com.dsa.basics;

public class ComputeHCF {

    public static void main(String args[]){
        System.out.println("HCF of 6 and 12 is:" + computeGCD(6,12));
        System.out.println("HCF of 11 and 13 is:" + computeGCD(11,13));
        System.out.println("HCF of 133 and 266 is:" + computeGCD(266,133));
    }

    private static int computeGCD(int a, int b) {
        if (a == 0)
            return b;
        else if (b == 0)
            return a;

        if (a > b)
            return computeGCD(a % b, b);
        else
            return computeGCD(b % a, a);
    }
}
