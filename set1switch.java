import java.util.Scanner;

public class set1switch {
    public static void main(String[] args) {
        System.out.println("Enter teh size:");
        Scanner in = new Scanner(System.in);
        int res = in.nextInt();
        switch (res) {
            case 29 -> System.out.println("small");
            case 30 -> System.out.println("medium");
            case 38 -> System.out.println("large");
            case 42 -> System.out.println("xlarge");
            default -> System.out.println("invalid input");
        }
    }
}
