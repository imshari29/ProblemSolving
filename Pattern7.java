public class Pattern7 {
    public static void main(String[] args) {
        int n = 4;
        //for (int i = 1; i <= n; i++)
        for (int i = n; i >= 1; i--){
            //for (int j = n-i+1; j >= 1; j--)
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
/*
public class ReP7 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = n-i+1; j >= 1; j--){ we can also use this logic
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}

 */