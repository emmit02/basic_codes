public class Pattern6 {
    
    public static void main(String[] args) {
        
        for (int i = 0; i <= 5; i++) {
            for (int j = 6; j >= i ; j--) {
                System.out.print("*");
            }System.out.println();

            for (int k = 0; k <= i ; k++) {
                System.out.print("1");
            }
        }
        System.out.println();

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.print("1");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
