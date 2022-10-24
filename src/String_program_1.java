
public class String_program_1 {

    static int findCommon(String a, String b, int m, int n) {

        if ((n == 0 || m == 0))
            return 1;

        if (a.charAt(m - 1) == b.charAt(n - 1))
            return findCommon(a, b, m - 1, n - 1) + findCommon(a, b, m - 1, n);
        else
            return findCommon(a, b, m - 1, n);
    }

    public static void main(String[] args) {
        String a = "ssdaprrotggl";
        String b = "parrot";
        System.out.println(findCommon(a, b, a.length(), b.length()));
    }

}
