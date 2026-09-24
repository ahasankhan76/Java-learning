import java.sql.SQLOutput;
import java.util.Scanner;

public class OrOperator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        if(num1 % 5==0 || num2 % 3 == 0){
            System.out.println("Divisible");

        }else {
            System.out.println("Not Divisible");
        }

    }
}
