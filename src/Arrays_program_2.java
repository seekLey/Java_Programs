import java.util.Arrays;
import java.util.Random;

public class Arrays_program_2 {

    public static void main(String[] args) {

        int a[] = {1,2,3,0,4,0,6,0,7};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a, 3));

//        Arrays.sort(a);
//        for (int num : a)
//            System.out.println(num);
    }
}