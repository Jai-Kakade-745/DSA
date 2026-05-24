// Basic Calculator
// Take two numbers and an operator (+, -, *, /) as input. Use switch on the operator to perform the calculation.

import java.util.*;

public class hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the operation you need to perform: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error! Division by zero.");
                } else {
                    System.out.println(a / b);
                }
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Enter a Valid Operator");
        }

        sc.close();
    }
}
