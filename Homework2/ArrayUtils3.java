package Homework2;
// Функция, возвращающая true, если в массиве есть два соседних элемента с нулевым значением
public class ArrayUtils3 {
    public static boolean hasAdjacentZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 0, 7, 2};
        System.out.println(hasAdjacentZeros(array)); // Output: true
    }
}
