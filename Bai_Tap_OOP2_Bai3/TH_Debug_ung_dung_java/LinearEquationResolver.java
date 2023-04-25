package Bai_Tap_OOP2_Bai3.TH_Debug_ung_dung_java;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("give a and b on ax + b = 0 pls :");
        double a = 2.0;
        double b = 3.2;
       if (a != 0){
           double answer = -b/a ;
           System.out.println("the primeter have one solution " + answer);
       } else if (b != 0){
           System.out.println("the primeter have no solution ");
       }else {
           System.out.println("no answer");
       }
    }
}
