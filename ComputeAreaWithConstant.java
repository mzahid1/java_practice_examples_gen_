//page 43
import java.util.Scanner;
public class ComputeAreaWithConstant{
	public static void main(String[] args){
		System.out.print("Enter a value for the Circle's Radius: ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		final double Pie = 3.14159;
		double Area = radius * radius * Pie;
		System.out.println("The Area for the circle with radius " + radius + " is " + Area);
	}
}