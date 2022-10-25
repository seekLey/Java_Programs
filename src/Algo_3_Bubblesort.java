public class Algo_3_Bubblesort {


    static void sort(int nums[]) {
        int l = nums.length;
        for (int i = 0; i < l - 1; i++)
            for (int j = 0; j < l - i - 1; j++)
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
    }

    void printArray(int arr[]) {
        int l = arr.length;
        for (int i = 0; i < l ; i++)
            System.out.print(arr[i] + " ");
    }


    public static void main(String[] args) {
        Algo_3_Bubblesort ab = new Algo_3_Bubblesort();
        int nums[] = {9, 8, 3, 1, 2};
        sort(nums);
        ab.printArray(nums);


    }
}
