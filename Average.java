import java.util.*;

public class Average{
	public static void main(String[] Args){ //Capitalizing A in args does not give error. But Why? Java is case sensitive. Right?
		System.out.println("This program computes the average of three numbers.");
		System.out.print("Enter the first number: ");
		Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble();
		System.out.print("Enter the second number: ");
		double n2 = input.nextDouble();
		System.out.print("Enter the third number: ");
		double n3 = input.nextDouble();
		System.out.print("Average of the three numbers: " + ((n1 + n2 + n3) / 3));
	}
}