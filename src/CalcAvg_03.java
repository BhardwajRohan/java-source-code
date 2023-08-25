//Q. Write a Java program to accept two number from the user and calculate the average.

/*explanation :
"Average" (often referred to as "mean") is a measure of central tendency in statistics. It represents the sum of a set of values divided by the total number of values in the set. It provides a single value that's representative of the entire dataset.

The formula for calculating the average is:

Average = Sum of all values / Total number of values

Mathematically, if you have a dataset with n values, and the values are denoted as x1, x2, ..., xn, then the average is calculated as:

Average = (x1 + x2 + ... + xn) / n

For example, if you have the values 5, 10, 15, and 20, the average would be:

Average = (5 + 10 + 15 + 20) / 4 = 12.5

In summary, the average is a way to represent the typical value in a dataset by summing up all the values and dividing by the total count of values.
* */

import java.util.Scanner;

public class CalcAvg_03 {

    public static void main(String[] args){

        double a, b, avg;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value : ");
        a = sc.nextDouble();

        System.out.print("Enter the second value : ");
        b = sc.nextDouble();

        //calculating avg
        avg = (a + b)/2;

        System.out.println("\n The average of given number " + a + " and " + b + " is " + avg + ".");





    }
}
