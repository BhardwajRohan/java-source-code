import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        long num = sc.nextLong();

        System.out.println("Enter that number to check occurrence : ");
        int occur = sc.nextInt();

        if(num < 0){
            System.out.println("Please enter value > 0");
        }

        int count = 0;
        while (num > 0){
            int last = (int)num % 10;
            if(last == occur){
                count++;
            }
            num /= 10;
        }
        System.out.println( "Occurrence of "+ occur + " = " + count);
    }
}
