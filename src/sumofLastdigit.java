import java.util.Scanner;

public class sumofLastdigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int sum = 0;           // pehle ek variable liya sum naam ka jisko 0 rakha hu
        while (n != 0){       // Agar n equal nhi hai 0 ke to loop chalega.
            int ld = n%10;     // ek variable liya last digit ka  input n ko 10 se %modules krenge taki last number mile
            sum += ld;         // ab last number ko sum me store krenge
            n/=10;          //input number ko n se divide krenge;
        }
        System.out.println(sum);

    }
}
