public class Prime_Number_Program {

    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " Prime");
        } else
            System.out.println(num + " Not Prime");
    }
}
