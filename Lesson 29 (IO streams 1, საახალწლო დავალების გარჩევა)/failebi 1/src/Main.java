import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // I/O input/output stream
//        System.out.write(77);
//        System.out.flush();

//        for (int i = 33; i <= 126; i++) {
//            System.out.write(i);
//        }
//        System.out.flush();

//        for (int i = 0; i < 4; i++) {
//            for (int j = 33; j <= 126; j++) {
//                System.out.write(j);
//            }
//        }

//        for (int i = 0; i < 500; i++) {
//            System.out.write(i);
//            System.out.println(i);
//        }

//        System.out.write(new byte[] {77});
//        System.out.flush();
//        System.out.close();

//        System.out.write(77);
//        System.out.close();


        // Input Streams
//        int input = System.in.read();
//        System.out.println(input);
//        System.out.println((char) input);

//        int[] chars = new int[10];
//        for (int i = 0; i < chars.length; i++) {
//            chars[i] = System.in.read();
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < chars.length; i++) {
//            System.out.write(chars[i]);
//        }
//        System.out.flush();

        try (
                InputStream input = new FileInputStream("example.txt")
        ) {
            while (true) {
                int data = input.read();
                if (data == -1) {
                    System.out.println("\nEnd of a file!");
                    break;
                } else {
                    System.out.write(data);
                }
                System.out.flush();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
    }
}
