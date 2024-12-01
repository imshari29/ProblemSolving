import java.util.Scanner;
public class Set2prob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int x = in.nextInt();
        for (int i = 1; i*x<=1000; i++){
            System.out.println(x+"x" +i+ "="+x*i);
        }
    }
}
