import java.util.Scanner;
public class ComputeAreaWithConsoleInput{
	public static void main(String[] Args){
		System.out.print("Enter a value for the Circle's Radius: ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double Area = radius * radius * 3.14159;
		System.out.println("The Area is " + Area);
	}
}