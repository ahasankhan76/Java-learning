import java.util.Scanner;

public class ntermsforAP { //ye Ap n' terms ko print krega aur count hoga ex= input :6 then print 1,2,3,4,5,6 etc but
    //n'terms ko print kra rhe hai aur diffrence hai 2 ka to print hoga 1,3,5,7,9,11 etc

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You Number ");
        int n = sc.nextInt();
        int a=1,d=2;  // a= jaha se number start ho aur d= kitne ka diffrence hai
        for (int i = 1; i<=n; i++){
            System.out.println(a);
               a += d;  // hamara har baar a me + ho difference
        }

    }
}
