package Practice;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        /* Swapping: assigning the value of one variable to another programmatically
        Input: a = 10 , b = 20;
        Output: a = 20, b = 10 */
        int a = 10, b = 20;
        System.out.println("Before swapping value are..." + a + " " + b);
        // Logic 1: Use third variable
//        int c = a;
//        a = b;
//        b = c;

        //Logic 2: Use addition and subtraction operator, without using third variable
//        a = a+b; // 10 + 20 =30
//        b = a-b; // 30 - 20 = 10
//        a = a-b; // 30 - 10 = 20

        //Logic 3: Use multiplication and division operators , without using third variable
        // Values of a & b !=0 , system will throw an automatic exception
//        a = a*b; // 10 * 20 = 200
//        b = a/b; // 200 / 20 = 10
//        a = a/b; // 200 / 10 = 20

        // Logic 4: Use bitwise XOR operators ("^")
//        Bitwise operators: provides the answer '1' if both of the bits in its operands are different,
//        if both of the bits are same then the XOR operator gives the result '0'.

//        a = a ^ b; // 1010 ^ 10100 = 11110 or value in decimals = 30
//        b = a ^ b; // 11110 ^ 10100 = 1010 or value in decimals = 10
//        a = a ^ b; // 11110 ^ 1010 = 10100 or value in decimals = 20

// 10 converted in binary code = 1010   20 converted in binary code = 10100

//        Logic 5: Use single statement

        b = a+b-(a=b); // The execution starts from write to left.

        /* 1. (a=b) = 20  ~ a=20
           2.  a+b = 30
           3. 30-20 = 10 ~ b = 10 */
        System.out.println("After swapping value are ..." + a+ " " + b);
    }
}




