import java.util.Scanner;

public class my_Calculator {

	
	private static Scanner input;
	private static Scanner input2;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);

        System.out.println("CALCULATOR");

        System.out.println("Here are your options:");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBSTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");

        System.out.println("What would you like to do?: ");
        int choice = input.nextInt();
        System.out.println();
        
        switch (choice) {
        case 1:  System.out.println("ADDITION");
        addition();
        break;
        case 2:  System.out.println("SUBSTRACTION");
        substraction();
        break;
        case 3:  System.out.println("MULTIPLICATION");
        multiplication();
        break;
        case 4:  System.out.println("DIVISION"); 
        division();
        break;
        default: System.out.println("INVALID CHOICE.");
        break;
        }
	}
	public static void addition(){

        int nOne, nTwo;
        input2 = new Scanner(System.in);

        System.out.println("First Number: ");
        nOne = input2.nextInt();

        System.out.println("Second Number: ");
        nTwo = input2.nextInt();
        
        System.out.println("Addition: " +Math.addExact(nOne, nTwo));
	}
	
	public static void substraction(){

        int nOne, nTwo;
        input2 = new Scanner(System.in);

        System.out.println("First Number: ");
        nOne = input2.nextInt();

        System.out.println("Second Number: ");
        nTwo = input2.nextInt();
        
        System.out.println("SUBSTRACTION: " +Math.subtractExact(nOne, nTwo));
	}
	
	public static void multiplication(){

        int nOne, nTwo;
        input2 = new Scanner(System.in);

        System.out.println("First Number: ");
        nOne = input2.nextInt();

        System.out.println("Second Number: ");
        nTwo = input2.nextInt();
        
        System.out.println("MULTIPLICATION: " +Math.multiplyExact(nOne, nTwo));
	}
	public static void division(){

        int nOne, nTwo;
        input2 = new Scanner(System.in);

        System.out.println("First Number: ");
        nOne = input2.nextInt();

        System.out.println("Second Number: ");
        nTwo = input2.nextInt();
        
        System.out.println("DIVISION: " +Math.floorDiv(nOne, nTwo));
	}
}
