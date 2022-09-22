public class Arrays_program_1 {


    public static void main(String[] args) {
        int a[] = new int[10];
        a[0] =0;
        a[1] =1;
        a[2] =2;
        a[3] =3;
        a[4] =4;
        a[5] =5;
        a[6] =6;
        a[7] =7;
        a[8] =8;
        a[9] =9;

//        int x[] = {1,2,3,4,5};

        for (int i : a) {
            System.out.println(i);
            i++;
        }
    }
}
