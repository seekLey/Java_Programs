public class PassByReference {

    int n;
}
class PP3{
    public static void c1(PassByReference r2){
        r2.n=300;
    }

    public static void main(String[] args) {
        PassByReference r1 = new PassByReference();
        r1.n=20;
        System.out.println("n= "+r1.n);
        c1(r1);
        System.out.println("n= "+r1.n);
    }
}
