package day14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your number = ");
        double num1 = scan.nextDouble();
        System.out.println("Type your second number =");
        double num2 = scan.nextDouble();
        System.out.println("Type your operator +, -, *, /,% ");
        char operator = scan.next().charAt(0);
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else if (operator == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Invalid operator " + operator);
        }
    }
}
