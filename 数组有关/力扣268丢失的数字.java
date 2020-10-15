class Solution {
    public int missingNumber(int[] nums) {
        int a = 0;
        int[] nums1 = new int [nums.length+1];
        for(int i = 0;i < nums1.length;i++) {
            nums1[i] = i;
        }
        for(int j = 0 ; j < nums.length;j++) {
            a = a^nums[j]^nums1[j];
        }
        a = a^(nums1[nums1.length-1]);
        return a;
    }
    }
//与[0-n]与运算，得出为丢失的。注意数组范围。