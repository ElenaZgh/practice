package Practice;
import java.util.Scanner;

public class Largestof3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();

//        Logic1
        if (a>b && a>c) {
            System.out.println(a + "is Largest Number");
        } else if (b>a && b>c) {
            System.out.println(b + "is Largest Number");
        }
        else {
            System.out.println(c + "is Largest Number");
        }

/* Ternary Operator - Java ternary operator is the only conditional operator that takes three operands.
        We can use the ternary operator in place of if-else conditions or even switch conditions using
        nested ternary operators */

        int largest1 = a>b?a:b; // largest of a & b
        int largest2 = c>largest1?c:largest1; // largest of c & largest1

        int largest = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(largest2 + "is Largest Number");
    }
}
