import java.util.*;

public class AverageModified2{
	public static void main(String[] Args){
		System.out.println("This program computes the average of three numbers.");
		System.out.print("Enter three number: ");
		Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble(), n2 = input.nextDouble(), n3 = input.nextDouble();
		System.out.print("Average of the three numbers: " + ((n1 + n2 + n3) / 3));
	}
}