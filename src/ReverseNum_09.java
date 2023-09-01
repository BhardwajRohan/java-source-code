import java.util.Scanner;

public class ReverseNum_09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to reverse : ");
        long num = sc.nextLong();

        long result = 0;

        while( num > 0){
            int lastD = (int)num % 10;
            result = result * 10 + lastD;
            num /= 10;
        }

        System.out.println("Reversed number = " + result);
    }
}
