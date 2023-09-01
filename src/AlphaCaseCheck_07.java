import java.util.Scanner;

public class AlphaCaseCheck_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any alpha character : ");

        char ch = sc.next().trim().charAt(0);

        if( ch >= 'A' && ch <= 'Z' ){
            System.out.println("Uppercase");
        }
        else if( ch >= 'a' && ch <= 'z' ){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Please enter valid character (A-Z or a-z)");
            main(args);
        }
    }
}
