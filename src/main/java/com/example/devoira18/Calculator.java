package com.example.devoira18;

public class Calculator {
    public static double calculateCompoundInterest(double principal, double interest, int years, int compounding){
        return Math.round(principal * Math.pow((1 + interest / compounding),(compounding * years)));
    }
}
