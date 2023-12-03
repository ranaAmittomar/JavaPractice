package algorithmBased;

public class BacktrackingQues {

    // including the questions based on advance recursion and backtracking.
    // Q1 :- Generate permutations of array and using backtrack.
    public static void generatePermutaions(int[] nums) {
        backtracking(nums, 0);

    }

    public static void backtracking(int[] nums, int start) {
        int n = nums.length;
        if (start == n) {
            // permution found,
            printArray(nums);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!containsDuplicate(nums, start, i)) {
                swap(nums, start, i); // swap elements at index i and start.
                backtracking(nums, start + 1); // recursive call for remaining elements.
                // backtrack-undo the swap for next iteration.
                swap(nums, start, i);
            }

        }
    }

    private static boolean containsDuplicate(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] == nums[end]) {
                return true;
            }
        }

        return false;
    }

    private static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    private static void printArray(int[] nums) {

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] num = { 1, 2 };
        generatePermutaions(num);
    }

}
