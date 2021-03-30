import java.util.*;
class q1_Area_and_perimeter_of_Reactangle{
   public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);

	   System.out.println("Enter the height of Rectangle:");
	   double height = scanner.nextDouble();

	   System.out.println("Enter the width of Rectangle:");
	   double width = scanner.nextDouble();

	   double perimeter = 2*(height + width);
	   double area = height*width;

	  System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
	  System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
	   
   }
}