public class Pattern9 {
    public static void main(String[] args) {
        //combination p3 pattern3 and pattern 5
        int n = 4;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i+1-1; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }





}
