package Practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
//      Take an  input from the user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

//       Logic 1: Use algorithm:
//        int reverse = 0;
//        while (num!=0){
//            reverse= reverse*10 + num%10;
//            num = num/10;
//        }

//       Logic 2: Use StringBuffer class - is used to create mutable (modifiable) strings.

//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer reverse= sb.reverse();

//       Logic 3: Using StringBuilder class

          StringBuilder sbl = new StringBuilder();
          sbl.append(num);
          StringBuilder reverse=sbl.reverse();


        System.out.println("Reverse number is" +" "+ reverse);

    }
}
