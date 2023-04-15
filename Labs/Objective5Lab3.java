import java.util.Scanner;
public class Objective5Lab3 {
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int userNum = scanner.nextInt();

		if (userNum < 0){
			System.out.println("The number is negative");
		}

		else if (userNum > 0){
			System.out.println("The number is positive");
		}

		else if (userNum == 0){
			System.out.println("The number is equal to zero");
		}

		scanner.close();
	}
}