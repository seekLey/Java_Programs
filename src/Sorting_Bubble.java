public class Sorting_Bubble {

    public void bubblesort(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 2; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Sorting_Bubble sb = new Sorting_Bubble();
        int k[] = {20, 800, 10, 99, 56, 42, 765};

        sb.bubblesort(k);
        sb.printArray(k);

    }


}
