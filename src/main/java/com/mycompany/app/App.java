package com.mycompany.app;
import java.util.Scanner;

public class Calc {

    public static int operator(int first, char operator, int second) {

        int result;

        switch (operator) {
        case '+':
            result = first + second;
            return result;

        case '-':
            result = first - second;
            return result;

        case '*':
            result = first * second;
            return result;

        case '/':
            result = first / second;
            return result;

        default:
            System.out.printf("Error! operator is not correct");
            return 0;
        }
    }

    
    public static void main(String[] args) {
        int sum, minus, mult, div;

        sum = Calc.operator(7,'+',2);
        System.out.printf("\n7+3 =%d", sum);

        minus = Calc.operator(4,'-',2);
        System.out.printf("\n4-2=%d", minus);

        mult = Calc.operator(2,'*',3);
        System.out.printf("\n2*3=%d", mult);

        div = Calc.operator(6,'/',2);
        System.out.printf("\n6/2=%d\n", div);
    }
}
