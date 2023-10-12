package Practice;

public class PrimeorNotPrimeNumber {
    /*
    Prime number - a whole number greater than 1 that cannot
    be exactly divided by any whole number other than itself
    and 1 (e.g. 2, 3, 5, 7, 11).*/

    public static void main(String[] args) {

        int num=3;
        int count=0;

        if (num>1){
            for (int i=1; i<=num; i++){
                if (num%i ==0)
                    count ++;
            }
            if (count == 2){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not Prime Number");
            }
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
