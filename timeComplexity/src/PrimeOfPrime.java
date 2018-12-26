import java.util.Scanner;

public class PrimeOfPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int last =sc.nextInt();

        for(int i=first; i< last;i++){

            if(isPrime(i)){
               if(isPrimeOfPrime(i)){
                   System.out.println(i);
               }
            }
        }



    }

    private static boolean isPrimeOfPrime(int i) {
        int n,sum =0;
        while(i > 0)
        {
            n = i % 10;
            sum = sum + n;
            i = i / 10;
        }
        if(isPrime(sum)){
            return true;
        }
        return false;
    }

    private static boolean isPrime(int num) {
        int rem;
        for(int i=2 ; i<=num/2;i++){
            rem = num%i;
            if(rem == 0){
                return false;
            }
        }

       return true;
    }
}
