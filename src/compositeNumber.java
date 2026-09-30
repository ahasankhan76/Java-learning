import java.util.Scanner;

public class compositeNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");

        int n = sc.nextInt();
        for(int i=1;i<=n-1;i++){
            if(n%2==0){
                System.out.println("Composite Number");

            }else {
                System.out.println("Not Composite Number");
                break;
            }
        }
    }
}
