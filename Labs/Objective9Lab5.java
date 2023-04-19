import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

   	System.out.println("Please enter a number: ");
   	num1 = kb.nextDouble();
   	System.out.println("Please enter another number: ");
   	num2 = kb.nextDouble();

		while (keepGoing) {

			System.out.print("Which would you like to do? ");
			printMenu();
			choice = kb.nextInt();

			switch (choice) {
      case 1:
      	double sum1 = findSum(num1, num2);
      	System.out.println(num1 + " + " + num2 + " = " + sum1);
      	break;
      case 2:
      	double sum2 = findAverage(num1, num2);
      	System.out.println("The average of " + num1 + " and " + num2 + " is: " + sum2);
      	break;
      case 3:
      	double sum3 = calcTax(num1, num2);
      	System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + sum3);
      	break;
      case 4:
      	System.out.println("You've chosen to quit.");
      	return;
      default:
      	System.out.println("Invalid entry. Please try again.");
      	break;

		}
		
	}
}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}
	public static double findSum(double x, double y) {
		double sum1 = x + y;
		return sum1;
	}
	public static double findAverage(double num1, double num2) {
  	double sum2 = (num1 + num2) / 2;
  	return sum2;
  }
  public static double calcTax(double num1, double num2) {
 		double sum3 = (num1 + num2) * .831;
 		return sum3;
 	}
}