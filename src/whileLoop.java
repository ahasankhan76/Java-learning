import java.util.Scanner;

public class whileLoop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x number");
        int x = sc.nextInt();
        System.out.println("Enter y number ");
        int y = sc.nextInt();
        while (x >= 0) {
            x--;
            y++;
            if(x==y){
                break;
            }else {
                System.out.println(x+""+y);
            }
        }

    }
}
