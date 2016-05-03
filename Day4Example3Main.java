import java.util.Scanner;

public class Day4Example3Main {

	public static void main(String[] args) {
		
		Scanner inputNumber = new Scanner(System.in);
		Scanner inputText = new Scanner(System.in);
		int choice;
		// this is the initialiser
		String answer = "y";
		
		
		//guard
		while(answer.equalsIgnoreCase("y")){
			
			System.out.println("Please choose an item from the menu: ");
			System.out.println("1. Convert Miles to Km");
			System.out.println("2. Converto Euro to Pounds");
			System.out.println("3. Convert Celsius to Fahrenheit");
			//read in the choice
			choice = inputNumber.nextInt();
			switch (choice){
			case 1:
				milestoKm();
				break;
				
			case 2:
				eurostoPounds();
				break;
				
			case 3:
				celciusToFahrenheit();
				break;
				default: 
					System.out.println("That is not a valid option");
			
			}
			
			
			System.out.println("Would you like to see the menu again? y or n");
			
			
			//advancer value comes from user input
			answer = inputText.nextLine();
			
		}
		System.out.println("OK. Goodbye!");
		
		
		
		
		
		

	}
	
	public static void milestoKm(){
		Scanner input = new Scanner(System.in);
		double miles, km;
		System.out.println("Please enter the number of miles: ");
		miles = input.nextInt();
		km = (miles/5.0 * 8.0);
		System.out.println(miles + "Miles = " + km + " kms");
		
		
	}
	
	public static void eurostoPounds(){
		Scanner input = new Scanner(System.in);
		double euro, pounds;
		System.out.println("Please enter the number of euro: ");
		euro = input.nextDouble();
		pounds = euro * 0.7;
		System.out.println(euro + "Euros = " + pounds + " Pounds");
		
		
	}
	
	public static void celciusToFahrenheit(){
		Scanner input = new Scanner(System.in);
		double c, f;
		System.out.println("Please enter the temperture: ");
		c = input.nextDouble();
		f = (c*9.0/5.0) + 32.0;
		System.out.println(c + " Celcius = " + f + "Fahrenheit");
		
	}
	
	

}
