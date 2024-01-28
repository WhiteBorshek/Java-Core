package Homework2;
// Метод, возвращающий количество чётных элементов массива
public class ArrayUtils {
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};

        System.out.println(countEvens(array1)); // Output: 3
        System.out.println(countEvens(array2)); // Output: 3
        System.out.println(countEvens(array3)); // Output: 0
    }
}
