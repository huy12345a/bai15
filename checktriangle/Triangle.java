package checktriangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 3 sides of the triangle: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if (checkTriangle(a, b, c)) {
                System.out.println("Triangle is a triangle");
            } else throw new IllegalTriangleException();

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkTriangle(double a, double b, double c) {
        return !(a < 0) && !(b < 0) && !(c < 0) && !(a + b < c) && !(b + c < a) && !(c + a < b);
    }
}
