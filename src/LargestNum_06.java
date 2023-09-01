import java.util.Scanner;

public class LargestNum_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Using Math.max function to calculate largest num;
        int max = Math.max(c,(Math.max(a,b)));
        System.out.println("Max = " + max);

    }
}
