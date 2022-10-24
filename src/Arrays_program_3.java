// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//          Input: nums = [2,7,11,15], target = 9
//          Output: [0,1]
//          Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class Arrays_program_3 {

    static int[] addUp(int nums[], int target) {
        int l = nums.length;
        for (int i = 0; i < l; i++)
            for (int j = 0; j < l - i; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[] = {1,4,5,2,9};
        int target = 9;
        int result[] = addUp(nums,target);

        System.out.println(result[0]+" "+ result[1] );
    }
}
