import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        int c = a / b;
//        System.out.println(c);

//        String name = null;
//        System.out.println(name.length());

//        int[] arr = new int[5];
//        System.out.println(arr[-1]);

//        String name = "Davit";
//        System.out.println(name.charAt(-1));
//        System.out.println("After exception");


//        try {
//            int result = 10 / 0;
//            System.out.println(result);
//            int[] arr = new int[5];
//            System.out.println(arr[-1]);
//            String name = null;
//            System.out.println(name.length());
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println("ან არითმეტიკული პრობლემაა ან მასივის");
//        } catch (Exception e) {
//            System.out.println("რაღაც სხვაშია პრობლემა");
//        } finally {
//            System.out.println("ეს ყოველთვის შესრულდება");
//        }
//        System.out.println("After exception");

//        System.out.println(finallyExample());


//        throw new ArithmeticException();

//        try {
//            System.out.println(checkAge( 16 ));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//        checkAge( 15 );


//        try {
//            FileReader fr = new FileReader("text.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }

//        try {
//            readFile();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }




    }

    static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("text.txt");
    }

    static int checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be greater than 18");
        }
        return age;
    }

    static int finallyExample() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}