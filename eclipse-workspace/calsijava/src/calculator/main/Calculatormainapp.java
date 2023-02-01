package calculator.main;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

import calculator.add.Addition;
import calculator.div.division;

public class Calculatormainapp {

	public static void main(String[] args) {
		int number1 = 15;
		int number2 = 5;
		int number3 = 4;
		int number4 = 0;
	
		
		Addition add = new Addition();
		add.sum(number1, number2);
		System.out.println(add.sum(number1, number2));
		
	SpecialAction sub = new subtraction();
	sub.subtraction(number1,number2);
	Object output = sub.subtract(number1, number2);
	system.out.println("subtraction output--"+output);
	
	Multiplication mul = new Multiplication();
	output= mul.multiply(number1, number2);
	System.out.println("multiplication output--"+output);
	
	division div = new division();
	output = div.Division(number1, number2);
	System.out.println("division output--"+output);
	
	modDivision modDiv = new momdDivision();
	output = modDiv.modDvision("modDivision output--"output);
	System.out.println(modDivision output--"+output);
	
	
		
}

}
