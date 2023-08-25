//Q. Write a Java program to calculate the sum and product of two given number.

/*
explain :

It seems like your question might be a bit ambiguous. "Product" and "sum" are mathematical operations that work differently.

Sum:
The sum is an arithmetic operation where you add two or more numbers together to get a result.
For example, the sum of 3 and 5 is 8: 3 + 5 = 8.

Product:
The product is an arithmetic operation where you multiply two or more numbers together to get a result.
For example, the product of 3 and 5 is 15: 3 × 5 = 15.
*/

public class CalcSumProduct_01 {

    public static void main( String[] args){

        int a, b, sum = 0, product = 0;

        a = 10;
        b = 20;

        //calculating sum
        sum = a + b;

        //calculating product
        product = a * b;

        //printing calculated ans
        System.out.println("the sum and product of two given number is " + sum + " and " + product + ".");

    }
}
