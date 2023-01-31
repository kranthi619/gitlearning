package calculator;

import java.util.Scanner;

public class main {
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first integer: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter second integer: ");
	        int num2 = sc.nextInt();

	        Calculator calculator = new Calculator();

	        System.out.println("Sum: " + calculator.add(num1, num2));
	        System.out.println("Difference: " + calculator.subtract(num1, num2));
	        System.out.println("Product: " + calculator.multiply(num1, num2));
	        System.out.println("Quotient: " + calculator.divide(num1, num2));

	        sc.close();
	    }
	    }
}
