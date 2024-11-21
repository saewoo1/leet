import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            nums1[0] = nums2[0];
        }
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (i >= m) {
                nums1[i] = nums2[j++];
            }
        }
        // 내림차순으로 정렬하라.
        Arrays.sort(nums1);
    }
}