import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // N1
        // sum = -1
        // sum = 1
        // sum = -2
        // sum = 2
        // sum = -3


        // N2
//        int[][] array = new int[5][5];
//        int array1[][] = new int[5][];
//        System.out.println(Arrays.deepToString(array1));
//        int[] array2 = new int[5][5];


        // N3
        // {3,1,2,3,4}
        // {3,4,2,3,4}
        // {3,4,3,3,4}
        // {3,4,3,4,4}
        // {3,4,3,4,3}
//        int[] arr = {0,1,2,3,4};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[(arr[i] + 3) % arr.length];
//            System.out.println(Arrays.toString(arr));
//        }
//        System.out.println(arr[1]);


        // N9
//        int[] array = new int[10];
//        System.out.println(Arrays.toString(array));


        // N10
        // {1,2,3,4,5,6} count=0
        // {4,2,3,4,5,6} count=4
        // {4,1,3,4,5,6} count=5
        // {4,1,6,4,5,6} count=11
        // {4,1,6,2,5,6} count=13
        // {4,1,6,2,8,6} count=21
        // {4,1,6,2,8,3} count=24


        // N16
//        int[] prices = {1,5,9,2,10,7};
//        int minPrice = prices[0];
//        int maxPrice = prices[0];
//        int minIndex = 0;
//        int maxIndex = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minPrice) {
//                minPrice = prices[i];
//                minIndex = i;
//            }
//            if (prices[i] > maxPrice) {
//                maxPrice = prices[i];
//                maxIndex = i;
//            }
//        }
//        System.out.println(minIndex + " მაღაზიაში ყველაზე იაფია და ღირს " + minPrice + " ლარი");
//        System.out.println(maxIndex + " მაღაზიაში ყველაზე ძვირია და ღირს " + maxPrice + " ლარი");


        // N17
//        for (int i = 0; i <= 100; i++) {
//            if (i % 5 == 0 && i % 7 == 0) {
//                System.out.println("HEYHOW");
//            } else if (i % 5 == 0) {
//                System.out.println("HEY");
//            } else if (i % 7 == 0) {
//                System.out.println("HOW");
//            } else {
//                System.out.println(i);
//            }
//        }


        // N18
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("გთხოვთ შეიყვანოთ რიგების რაოდენობა: ");
//        int rows = scanner.nextInt();
//        System.out.print("გთხოვთ შეიყვანოთ სვეტების რაოდენობა: ");
//        int columns = scanner.nextInt();
//        System.out.println();
//
//        int[][] array = new int[rows][columns];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                array[i][j] = random.nextInt(100);
//            }
//        }
//
//        System.out.println("დაგენერირებული 2 განზომილებიანი მასივია: ");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int min = array[0][0];
//        int max = array[0][0];
//        int minRow = 0, minCol = 0;
//        int maxRow = 0, maxCol = 0;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                if (array[i][j] < min) {
//                    min = array[i][j];
//                    minRow = i;
//                    minCol = j;
//                }
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                    maxRow = i;
//                    maxCol = j;
//                }
//            }
//        }
//        System.out.println("მინიმალური ელემენტია: " + min + " ინდექსზე (" + minRow + ", " + minCol + ")");
//        System.out.println("მაქსიმალური ელემენტია: " + max + " ინდექსზე (" + maxRow + ", " + maxCol + ")");


        // N19
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("გთხოვთ შეიყვანოთ რიგების რაოდენობა: ");
//        int rows = scanner.nextInt();
//        System.out.print("გთხოვთ შეიყვანოთ სვეტების რაოდენობა: ");
//        int columns = scanner.nextInt();
//        System.out.println();
//
//        int[][] array = new int[rows][columns];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                array[i][j] = random.nextInt(10);
//            }
//        }
//
//        System.out.println("დაგენერირებული 2 განზომილებიანი მასივია: ");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int n = array.length;
//        int diagonalSum = 0;
//        for (int i = 0; i < n; i++) {
//            diagonalSum += array[i][i];
//            diagonalSum += array[i][n - i - 1];
//        }
//        System.out.println(diagonalSum);
//        if (n % 2 == 1) {
//            diagonalSum -= array[n / 2][n / 2];
//        }
//
//        System.out.println(diagonalSum);


        // N20
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("გთხოვთ შეიყვანოთ რიგების რაოდენობა: ");
        int rows = scanner.nextInt();
        System.out.print("გთხოვთ შეიყვანოთ სვეტების რაოდენობა: ");
        int columns = scanner.nextInt();
        System.out.println();

        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        System.out.println("დაგენერირებული 2 განზომილებიანი მასივია: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][n - j - 1];
                array[i][n - j - 1] = temp;
            }
        }

        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
