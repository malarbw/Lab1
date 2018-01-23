import java.util.Scanner;

public class RoomSize {
	
	public static void main(String [] args) { //create scanner and declare necessary variables
		Scanner input = new Scanner(System.in);
		double length;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
	
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!"); //provide user prompts to get necessary input
		System.out.println("Enter Length: ");
		length = input.nextDouble();
		System.out.println("Enter Width: ");
		width = input.nextDouble();
		System.out.println("Enter Height: ");
		height = input.nextDouble();

		
		area = length * width; //use  formulas for area, perimeter, and volume to get those values from the input
		perimeter = 2 * (length + width);
		volume = length * width * height;
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Volume: " + volume);
		System.out.println();
		System.out.println("Continue? (y/n): ");
		
	
		
		/*been having trouble with the continue option, tried to use a while loop so that it would run the program again
		 * while the user continued to input 'y' at the end prompt but it wasn't functioning
		 */
		
		
	}
			
			
}
		
