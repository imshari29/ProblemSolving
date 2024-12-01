import java.util.Scanner;

public class Set2prob3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter firstname : ");
        String a = in.next();
        System.out.println("Enter lastname : ");
        String b = in.next();
        System.out.println("Enter the val of n : ");
        int n = in.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println(a+b);
        }
    }
}
