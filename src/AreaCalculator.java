import java.util.Scanner;

public class AreaCalculator {
    
    // TODO: Define calculateArea(float radius) -> returns area of circle
    // Use Math.PI or 3.14159f for pi

    // TODO: Define calculateArea(float length, float breadth) -> returns area of rectangle

    // TODO: Define calculateArea(double base, double height) -> returns area of triangle




     double calculateArea(float r) {
        return Math.PI * r * r;   
    }

    double calculateArea(float l, float b) {
        return l * b;
    }

    double calculateArea(double b, double h) {
        return 0.5 * b * h;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read input for Circle (radius)
        // TODO: Read input for Rectangle (length, breadth)
        // TODO: Read input for Triangle (base, height)
        
        // TODO: Call methods and print results formatted to 2 decimal places
        // Hint: Use System.out.printf("%.2f\n", area);

	AreaCalculator a = new AreaCalculator();

        float radius = sc.nextFloat();
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.printf("%.2f\n", a.calculateArea(radius));
        System.out.printf("%.2f\n", a.calculateArea(length, breadth));
        System.out.printf("%.2f\n", a.calculateArea(base, height));


	        sc.close();
    }
}
