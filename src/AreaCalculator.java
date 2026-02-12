import java.util.Scanner;

public class AreaCalculator {
    
    // TODO: Define calculateArea(float radius) -> returns area of circle
    // Use Math.PI or 3.14159f for pi

    // TODO: Define calculateArea(float length, float breadth) -> returns area of rectangle

    // TODO: Define calculateArea(double base, double height) -> returns area of triangle


    double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(float length, float breadth) {
        return length * breadth;
    }

    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read input for Circle (radius)
        // TODO: Read input for Rectangle (length, breadth)
        // TODO: Read input for Triangle (base, height)
        
        // TODO: Call methods and print results formatted to 2 decimal places
        // Hint: Use System.out.printf("%.2f\n", area);

	 AreaCalculator obj = new AreaCalculator();

        float radius = sc.nextFloat();
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double circleArea = obj.calculateArea(radius);
        double rectangleArea = obj.calculateArea(length, breadth);
        double triangleArea = obj.calculateArea(base, height);

        System.out.printf("Area of Circle: %.2f\n", circleArea);
        System.out.printf("Area of Rectangle: %.2f\n", rectangleArea);
        System.out.printf("Area of Triangle: %.2f\n", triangleArea);

        sc.close();
    }
}
