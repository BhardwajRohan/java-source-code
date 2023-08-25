//Q. Write a Java program to convert fahrenheit to celsius and celsius to fahrenheit.

/*
explanation :

--> "Fahrenheit and Celsius " are two different temperature scales used to measure temperature. The have different reference points and units of measurement.

    Fahrenheit (°F) : This is a temperature scale commonly used in the united states. On the Fahrenheit scale, the freezing point of water is 32°F, and the boiling point of water is 212°F at standard atmospheric pressure.

    Celsius (°C) : Also known as the centigrade scale, Celsius is widely used in most part of the world for scientific and everday temperature measurements.On the celsius scale, the freezing point of water is 0°C, and the boling point of water is 100°C at standard atmospheric pressure.

    -Formula

    Fahrenheit to Celsius:
    °C = (°F - 32) * 5/9

    Celsius to Fahrenheit:
    °F = (°C * 9/5) + 32

    eg.
    Let's do some conversions:
    1. Convert 68°F to Celsius
        °C = (68 - 32) * 5/9 = 10°C;
    2.Convert 25°C to Fahrenheit
        °F = (25 * 9/5) + 32 = 77°F;


 */
import java.util.Scanner;

public class CalcFahrenheitCelsius_04 {


    public static void fahrenheitToCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit value : ");
        double value = sc.nextDouble();

        double celsius = ( value - 32 ) * 5/9;

        System.out.println(value + "°F in Celsius = " + celsius + "°C." );
    };

    public static void CelsiusToFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius value : ");
        double value = sc.nextDouble();

        double fahrenheit = (value * 9/5) + 32 ;

        System.out.println(value + "°C in Fahrenheit = " + fahrenheit + "°F." );
    };


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int action;

        System.out.println("What Action would you like to perform \n 1. Fahrenheit to Calsius \n 2. Calsius to Fahrenheit \n (Press 1 or 2 to perform action else press 0 to exit.)");
        action = sc.nextInt();


        switch (action){
            case 1 :
                fahrenheitToCelsius();
                break;
            case 2 :
                CelsiusToFahrenheit();
                break;
            case 0 :
                System.out.println("Thank you -> Exit.");
                break;
            default:
                System.out.println("Please Enter valid input.");
                main(args);

        }

    }
}
