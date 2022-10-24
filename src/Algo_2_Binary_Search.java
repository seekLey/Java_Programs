import java.util.Arrays;
import java.util.Scanner;


public class Algo_2_Binary_Search {

    public static void main(String[] args) {

        System.out.println("Enter size of array");

        Scanner sc = new Scanner(System.in); // to read the array size from user
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " number"); // to ask user to ADD values inside array

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt(); // iterate through the array

        Arrays.sort(arr);
        System.out.println("sorted array " + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);

        int mod = arr.length%2;
        System.out.println(mod);



    }
}
