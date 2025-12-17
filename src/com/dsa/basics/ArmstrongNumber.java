package com.dsa.basics;

public class ArmstrongNumber {

    public static void main(String[] args){
        System.out.println(isArmstrong(153));
    }

    private static boolean isArmstrong(int n) {
        String val = String.valueOf(n);
        double numTotal = 0;
        while (n > 0) {
            numTotal += Math.pow((double) (n % 10), val.length());
            n = n / 10;
        }
        return (int)numTotal == Integer.parseInt(val);
    }

}
