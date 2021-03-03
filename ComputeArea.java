public class ComputeArea{
	public static void main(String[] Args){
		double radius; // Declare radius
		double area; // Declare area
		
		// Assign a radius
		radius = 20; // Radius is now 20
		
		// Compute area
		area = radius * radius * 3.14159;
		
		//Dispaly results
		System.out.println("The area of the circle of radius " +
		  radius + " is "+ area);
	}
}