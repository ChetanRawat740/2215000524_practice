// 1. Welcome to Bridgelabz!
// Write a program that prints "Welcome to Bridgelabz!" to the screen.
public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Bridgelabz!");
    }
}

// 2. Add Two Numbers
// Write a program that takes two numbers as input from the user and prints their sum.
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double sum = a + b;
        System.out.println("Sum is: " + sum);
    }
}

// 3. Celsius to Fahrenheit Conversion
// Write a program that takes the temperature in Celsius as input and converts it to Fahrenheit using the formula: Fahrenheit = (Celsius * 9/5) + 32.
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

// 4. Area of a Circle
// Write a program to calculate the area of a circle. Take the radius as input and use the formula: Area = π * radius^2.
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

// 5. Volume of a Cylinder
// Write a program to calculate the volume of a cylinder. Take the radius and height as inputs and use the formula: Volume = π * radius^2 * height.
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}

// 6. Calculate Simple Interest
// Write a program to calculate simple interest using the formula: Simple Interest = (Principal * Rate * Time) / 100.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}

// 7. Perimeter of a Rectangle
// Write a program to calculate the perimeter of a rectangle. Take the length and width as inputs and use the formula: Perimeter = 2 * (length + width).
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}

// 8. Power Calculation
// Write a program that takes two numbers as input: a base and an exponent, and prints the result of base raised to the exponent (without using loops or conditionals).
import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}

// 9. Calculate Average of Three Numbers
// Write a program that takes three numbers as input from the user and prints their average.
import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average is: " + average);
    }
}

// 10. Convert Kilometers to Miles
// Write a program that takes the distance in kilometers as input from the user and converts it into miles using the formula: Miles = Kilometers * 0.621371.
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = scanner.nextDouble();
        double miles = km * 0.621371;
        System.out.println(km + " kilometers is equal to " + miles + " miles");
    }
}
