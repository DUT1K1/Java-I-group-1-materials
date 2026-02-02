import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
//        try {
//            InputStream input = new FileInputStream("file1.txt");
//
//            while (true) {
//                int data = input.read();
//                if (data == -1) {
//                    System.out.println("\nფაილი მორჩა");
//                    break;
//                } else {
//                    System.out.write(data);
//                }
//                System.out.flush();
//            }
//        } catch (IOException e) {
//            System.err.println("ფაილი ვერ ვიპოვე!");
//        }


//        try {
//            byte[] data = new byte[20];
//            System.in.read(data);
//
//            System.out.println(new String(data));
//        } catch (Exception e) {
//
//        }

//        try {
//            InputStream input = new FileInputStream("src/file2.txt");
//
//            byte[] data = new byte[input.available()];
//            input.read(data);
//
////            for (byte b : data) {
////                System.out.write(b);
////            }
////            System.out.flush();
//
//            System.out.write(data);
//        } catch (IOException e) {
//            System.err.println("IO Problem");
//        }

//        try {
//            FileInputStream fis = new FileInputStream("src/file2.txt");
//            for (int i = fis.read(); i != -1; i = fis.read()) {
//                System.out.write(i);
//            }
//            System.out.flush();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }

//        try {
//            FileOutputStream fos = new FileOutputStream("example.txt");
//
//            String text = "Hello this is Davit\nI am writing into something" +
//                    ".txt file\nfrom Java";
//            byte[] data = text.getBytes();
//
//            fos.write(data);
//            fos.flush();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }


//        try {
//            FileOutputStream fos = new FileOutputStream("example.txt");
//
//            while (true) {
//                int input = System.in.read();
//
//                if (input == 10) {
//                    break;
//                } else {
//                    fos.write(input);
//                    fos.flush();
//                }
//            }
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }


//        try (
//                FileInputStream input = new FileInputStream("src/file2.txt");
//                FileOutputStream output = new FileOutputStream("example.txt")
//        ) {
//            byte[] data = input.readAllBytes();
//            output.write(data);
//            output.flush();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }

        try {
            FileInputStream input = new FileInputStream("src/file2.txt");
            input.close();
            System.out.println(new String(input.readAllBytes()));;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
