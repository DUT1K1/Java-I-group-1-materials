import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] array = new int[5];
//        System.out.println(Arrays.toString(array));
//        int[] arr2 = { 1, 2, 3, 4, 5 };
//        System.out.println(Arrays.toString(arr2));

        // size = n
        // index = [0, n-1]


        // ელემენტებზე წვდომა
//        int[] arr3 = { 25, 33, -10, 224 };
//        System.out.println(arr3[2]); // -10
//        System.out.println(arr3[4]); // java.lang.ArrayIndexOutOfBoundsException
//        System.out.println(arr3[-1]); // java.lang.ArrayIndexOutOfBoundsException


//        for (int i = 0; i < 40; i++) {
//            System.out.println("arr3[" + i + "] = " + arr3[i]);
//        }


        // მასივის ზომა
//        int[] arr4 = {25, 33, -10, 224};
//        System.out.println(arr4.length);
//
//        for (int i = 0; i < arr4.length; i++) {
//            System.out.println("arr4[" + i + "] = " + arr4[i]);
//        }

        // მასივის შევსება
//        int[] fiftyElementArray = new int[50];
//        for (int i = 0; i < fiftyElementArray.length; i++) {
//            fiftyElementArray[i] = i * i * i;
//        }
//        System.out.println(Arrays.toString(fiftyElementArray));

        // for-each ციკლის მაგალითი
//        for (int currentNumber : fiftyElementArray) {
//            System.out.println(currentNumber);
//        }

        // 2d მასივები
//        int[][] twoDArray = new int[4][5];
//        System.out.println(Arrays.deepToString(twoDArray));
//        twoDArray[0][3] = 10;
//        System.out.println(Arrays.deepToString(twoDArray));

        // 2d მასივზე იტერაცია
//        int[][] twoDArray = new int[4][5];
//        for (int i = 0; i < twoDArray.length; i++) {
//            for (int j = 0; j < twoDArray[i].length; j++) {
//                System.out.print(twoDArray[i][j] + "\t");
//            }
//            System.out.println();
//        }

        // ჩვენით შევქმნათ 2d მასივი
//        int[][] customTwoD = {
//                {2},
//                {99, -110},
//                {1,1,1,1,1,1,1,1,1,11,}
//        };
//        for (int i = 0; i < customTwoD.length; i++) {
//            for (int j = 0; j < customTwoD[i].length; j++) {
//                System.out.print(customTwoD[i][j] + "\t");
//            }
//            System.out.println();
//        }


        // შემთხვევითი რიცხვებით შევავსოთ მასივი
        Random random = new Random();
        int[][] randomTwoD = new int[6][10];
        for (int i = 0; i < randomTwoD.length; i++) {
            for (int j = 0; j < randomTwoD[i].length; j++) {
                // 10-დან 100-მდე შემთხვევითი რიცხვი
                // 10 ითვლება 100 არ ითვლება
                randomTwoD[i][j] = random.nextInt(10,100);
            }
        }

//        for (int i = 0; i < randomTwoD.length; i++) {
//            for (int j = 0; j < randomTwoD[i].length; j++) {
//                System.out.print( randomTwoD[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        for (int[] row : randomTwoD) {
//            for (int element : row) {
//                System.out.print(element + "\t");
//            }
//            System.out.println();
//        }


        // მრავალ განზომილებიანი მასივები
        int[][][][] fourDArray = new int[2][2][2][2];
        int [][][][][][][][][][][][][][][][][][][][][][][][][][][] arr = new int[2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2];
        System.out.println(Arrays.deepToString(fourDArray));
    }
}
