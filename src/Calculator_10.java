import java.util.Scanner;

public class Calculator_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        double x = sc.nextDouble();
        System.out.println("Enter operation type (+, -, *, /, %)");
        char op = sc.next().trim().charAt(0);
        System.out.println("Enter second number : ");
        double y = sc.nextDouble();

        double result = 0;

        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

            switch (op){
                case '+' :
                    result = x + y;
                    break;
                case '-' :
                    result = x - y;
                    break;
                case '*' :
                    result = x * y;
                    break;
                case '/' :
                    result = x / y;
                    break;
                case '%' :
                    result = x % y;
                    break;
                default:
                    System.out.println("try again.");
            }
        }
        else{
            System.out.println("Invalid operation - try again.");
            main(args);
        }
        System.out.println("Result = " + result);
    }
}
