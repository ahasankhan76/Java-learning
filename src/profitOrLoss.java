import java.util.Scanner;

public class profitOrLoss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price");
        double cp = sc.nextDouble();
        System.out.println("Enter sell price");
        double sp = sc.nextDouble();
        if (cp>sp){
            System.out.println("Loss");
        } else if (sp>cp) {
            System.out.println("Profit");

        }else if (cp==sp){
            System.out.println("no profit or no loss");
        }
    }
}
