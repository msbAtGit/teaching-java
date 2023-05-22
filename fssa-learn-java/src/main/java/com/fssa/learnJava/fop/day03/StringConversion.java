package com.fssa.learnJava.fop.day03;

public class StringConversion {
    public static void main(String[] args) {
        double pi = Double.parseDouble("3.14");
        String str1 = String.valueOf(pi);
                String str2 = Double.toString(pi);
        System.out.println (str1);
        System.out.println(str2 );
    }
}
