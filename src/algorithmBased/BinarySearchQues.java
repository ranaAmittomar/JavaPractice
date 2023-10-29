package algorithmBased;

public class BinarySearchQues {

    public static int nonRepeatedSearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;// this is crucial, because when element is found, we must return , else it'll
                // cause the infinite loop
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int repeatedNumsSearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length;
        if (arr.length == 0) {
            return -1;
        }
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                end = mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid;
            }
        }

        if (start == arr.length)
            return -1;
        // Similar to the previous algorithm
        return arr[start] == target ? start : -1;

        // return start; // starting index of repeated element. i.e..First occurence.

    }

    public static int right_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // Don't return! Lock right border
                left = mid + 1;
            }
        }
        // Check whether right border out of bounds lastly
        if (right < 0 || nums[right] != target)
            return -1;
        return right;
    }

    public static void reverseArrayByTwoPoint() {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 9 };
        int target = 9;
        int[] arr1 = { 2, 2, 2, 2, 3, 5, 6 };
        int target2 = 2;
        System.out.println(nonRepeatedSearch(arr, target));
        System.out.println(repeatedNumsSearch(arr1, target2));
        System.out.println(right_bound(arr1, target2));
        reverseArrayByTwoPoint();
    }

}
