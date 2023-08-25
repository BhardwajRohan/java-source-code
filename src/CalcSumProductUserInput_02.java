//Importing Scanner class from java.util package to get input from the user.
import java.util.Scanner;

//Main Class.
public class CalcSumProductUserInput_02 {

    //Main Driver Class
    public static void main(String[] args){

        //Creating Variables to store values;
        int a, b, sum = 0, product = 0;

        //Creaing an Object of The Scanner class that provide us methods to get input from the user and store them in variables
        Scanner sc = new Scanner(System.in);

        //Printing out an instruction for users and get the input and store them in variable a.
        System.out.print("Enter the first number : ");
        a = sc.nextInt();

        //Printing out an instruction for users and get the input and store them in variable b..
        System.out.print("Enter the second number : ");
        b = sc.nextInt();

        //Calculating sum of two given numbers by the user.
        sum = a + b;

        //Calculating product of two given numbes by the user.
        product = a * b;

        //Printing the result.
        System.out.println("\n The sum = "+ sum + ", product = " + product + ".");

    }
}
