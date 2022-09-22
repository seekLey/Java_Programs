public class Pattern_Program_1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(j);
                if (j == 4) {
                    for (int k = 1; k < i; k++) {
                        System.out.print(k);
                    }
                }
            }
            System.out.println();
        }
    }
}
