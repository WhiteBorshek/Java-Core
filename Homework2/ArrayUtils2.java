package Homework2;
// Функция, возвращающая разницу между самым большим и самым маленьким элементами массива
public class ArrayUtils2 {
    public static int findDifference(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 1, 8, 4};
        System.out.println(findDifference(array)); // Output: 7
    }
}
