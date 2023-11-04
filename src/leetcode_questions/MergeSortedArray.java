package leetcode_questions;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int[] firstArr = { 1, 3, 5, 7, 9 };
        int[] secondArr = { 2, 4, 6, 8 };
        int firstLen = firstArr.length;
        int secondLen = secondArr.length;
        System.out.println();

    }
}
