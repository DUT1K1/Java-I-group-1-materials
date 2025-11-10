import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        // Exercise 1
//        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        System.out.println(sum);

        // Exercise 2
//        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }

        // Exercise 3
//        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        int min = array[0];
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println("Min: " + min + " Max: " + max);

        // Exercise 4
//        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        int odd = 0;
//        int even = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//        }
//        System.out.println("Even: " + even + " Odd: " + odd);

        // Exercise 5
//        int[] arr1 = {1,2,3};
//        int[] arr2 = {4,5,6};
//        int[] merged = new int[arr1.length + arr2.length];
//
//        for (int i = 0; i < arr1.length; i++) {
//            merged[i] = arr1[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            merged[arr1.length + i] = arr2[i];
//        }
//
//        System.out.println(Arrays.toString(merged));

        // Exercise 6
//        int[] arr = {1, 99, 23, 1};
//        int[] arr = {10, 99, 102, 423};
//
//        boolean sorted = true;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                sorted = false;
//                break;
//            }
//        }
//        if (sorted) {
//            System.out.println("Array is sorted");
//        } else {
//            System.out.println("Array is not sorted");
//        }

        // Exercise 7
        // {1,2,3} -> {3,1,2} -> {2,3,1}
        int[] arr = {1,2,3,4,5};
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println( Arrays.toString(arr));
    }
}
