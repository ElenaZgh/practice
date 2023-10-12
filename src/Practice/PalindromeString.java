package Practice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
/*       A palindrome String is a String that remains the same
when its characters are reversed
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String:");

        String str = scanner.next();
        String str1 = str;

        String rev = "";

        int len = str.length();

        for (int i = len-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        if (str1.equals(rev)){
            System.out.println(str1 +" " + "is Palindrome String");
        }else{
            System.out.println(str1 + " " + " is Not Palindrome String");
        }

    }
}
