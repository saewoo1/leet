/**
2번 까지만 중복 가능하도록 제자리 수정
 */

class Solution {
    public int removeDuplicates(int[] nums) {

        int count = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[count - 2]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}