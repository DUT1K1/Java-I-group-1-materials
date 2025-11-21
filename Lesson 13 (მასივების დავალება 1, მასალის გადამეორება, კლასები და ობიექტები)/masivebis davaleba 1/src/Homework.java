import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // N1
//        int[] b = new int[12];
//        for (int i = 0; i < b.length; i++) {
//            b[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(b));

        // N2
//        int[] b = new int[12];
//        for (int i = 0; i < b.length; i++) {
//            b[i] = i + 1;
//        }
//        double sum = 0;
//        int product = 1;
//        for(int i : b) {
//            sum += i;
//            product *= i;
//        }
//        System.out.println("Sum: " + sum);
//        System.out.println("Product: " + product);
//        System.out.println("Average: " + sum / b.length);

        // N3
//        Random random = new Random();
//        int[] b = new int[20];
//        for (int i = 0; i < b.length; i++) {
//            b[i] = random.nextInt(21);
//        }
//        int min = b[0];
//        int max = b[0];
//        for (int i = 1; i < b.length; i++) {
//            if (b[i] < min) {
//                min = b[i];
//            } else if (b[i] > max) {
//                max = b[i];
//            }
//        }
//        System.out.println(Arrays.toString(b));
//        System.out.println("Min: " + min);
//        System.out.println("Max: " + max);

        // N4
//        int[] b = new int[15];
//        for (int i = 0; i < b.length; i++) {
//            b[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(b));

        // N5
//        int[] b = new int[15];
//        for (int i = 0; i < b.length; i++) {
//            b[i] = i + 1;
//        }
//        double sum = 0;
//        int product = 1;
//        for(int i : b) {
//            sum += i;
//            product *= i;
//        }
//        System.out.println("Sum: " + sum);
//        System.out.println("Product: " + product);
//        System.out.println("Average: " + sum / b.length);


        // N6
//        int[] numbers = {1,2,3,4,5};
//        int x = 2;
//        for (int i : numbers) {
//            if (i == x) {
//                System.out.println("Found " + x);
//                break;
//            }
//        }


        // N7.1
        // [1,2,3] -> 99 =? [99,  1,  2, 3] ]
//        Scanner sc = new Scanner(System.in);
//        int[] numbers = {1,2,3};
//        System.out.print("Please enter a number: ");
//        int numToAdd = sc.nextInt();
//        int[] newNumbers = new int[numbers.length + 1];
//
//        newNumbers[0] = numToAdd;
//        for (int i = 0; i < numbers.length; i++) {
//            newNumbers[i + 1] = numbers[i];
//        }
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(newNumbers));


        // N7.2
//        Scanner sc = new Scanner(System.in);
//        int[] numbers = {1,2,3};
//        System.out.print("Please enter a number: ");
//        int numToAdd = sc.nextInt();
//        int[] newNumbers = new int[numbers.length + 1];
//
//        newNumbers[numbers.length] = numToAdd;
//        for (int i = 0; i < numbers.length; i++) {
//            newNumbers[i] = numbers[i];
//        }
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(newNumbers));


        // N8
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//        int target = 21;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target && i != j) {
//                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
//                    break;
//                }
//            }
//        }


        // N9
//        Scanner sc = new Scanner(System.in);
//        int[] numbers = {1,2,3,4,5};
//        System.out.println(Arrays.toString(numbers));
//
//        System.out.print("Please enter a number to remove: ");
//        int numToRemove = sc.nextInt();
//        int[] newNumbers = new int[numbers.length - 1];
//        int index = -1;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == numToRemove) {
//                index = i;
//                break;
//            }
//        }
//        if (index != -1) {
//            int currInt = 0;
//            for (int i = 0; i < numbers.length; i++) {
//                if (i != index) {
//                    newNumbers[currInt] = numbers[i];
//                    currInt++;
//                }
//            }
//            System.out.println(Arrays.toString(newNumbers));
//        } else {
//            System.out.println("Number not found");
//        }


        // N10
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5};

        while (true) {
            System.out.println(Arrays.toString(numbers));
            System.out.print("Please enter a number to make it zero: ");
            int numToMakeZero = sc.nextInt();

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numToMakeZero) {
                    numbers[i] = 0;
                }
            }

            boolean allZero = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] != 0) {
                    allZero = false;
                }
            }

            if (allZero) {
                break;
            }
        }
        System.out.println("All numbers are zero");
        System.out.println(Arrays.toString(numbers));
    }
}
