//Q. Write a Java program to calculate the area of triangle using three sides.

/*
Explanation :

The formula to calculate the area of a triangle depends on the information you have about the triangle. There are different formulas for calculating the area of a triangle based on the given side lengths and heights. Here are a few scenarios:

1.Using Base and Height:
If you have the length of the base (b) and the height (h) of the triangle, you can use the following formula:

Area = (base * height) / 2

2.Using Heron's Formula:
If you have the lengths of all three sides of the triangle (a, b, c), you can use Heron's formula:

Area = √[s * (s - a) * (s - b) * (s - c)]

where s is the semi-perimeter of the triangle: s = (a + b + c) / 2

3.Using Side and Height:
If you have the length of one side (a) and the corresponding height (h) to that side, you can use the following formula:

Area = (side * height) / 2

Remember, the units of measurement for the side lengths and heights should be consistent (e.g., both in meters, centimeters, etc.).


 */

import java.util.Scanner;
import java.lang.Math;

public class CalcTriangleArea_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //creating variables to store triangle's side length
        int a, b, c ;
        double s, area;


        System.out.print("Enter the triangle three side length (cm) : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        //calculating semi-perimeter -> s = semi-perimeter;
        s = (a + b + c) / 2;


        //calculating area of the triangle using Heron's formula;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));


        //printing result (area of the triangle)
        System.out.println("Area = " + area + "cm2.");
    }
}
