public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= n; i++){
           // for (int j = 1; j <= i-1+1; j++){
            //the above does give space to down triangle if used
            //for spaces
            for (int j = 1; j <= i-1; j++){
                System.out.print("  ");
            }
            //for (int j = 1; j <= (2*n-2)-(2*i-1) ; j++) {
            //the above line prints 5 stars 3 and 1
            //for stars
            for (int j = 1; j <= (2*n)-(2*i-1) ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
