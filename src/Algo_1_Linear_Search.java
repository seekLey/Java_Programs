import java.util.Scanner;

public class Algo_1_Linear_Search {

    // Program to search value in unsorted Array using Linear Search
    // Worst case : O(n) : element found in last position
    // Best case : O(1) : element found in first position

    public static void main(String[] args) {
        System.out.println("Enter size of array");

        Scanner sc = new Scanner(System.in); // to read the array size from user
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " number"); // to ask user to ADD values inside array

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt(); // iterate through the array

        System.out.println("Enter elements you want to search");

        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                System.out.println("Match at position " + arr[i]);
            else
                System.out.println("No match");
        }
    }
}
