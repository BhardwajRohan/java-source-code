import java.util.Scanner;

public class Fibonacci_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n to find nth fibonacci number : ");

        int x = sc.nextInt();

        int f = 0, s = 1, count = 2;


        while (count <= x){
            int tempt = f;
            f = s;
            s = f + tempt;
            count ++;
        }

        System.out.println(s);
    }
}
