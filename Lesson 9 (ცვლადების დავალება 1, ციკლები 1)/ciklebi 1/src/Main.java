public class Main {
    public static void main(String[] args) {
//        int x = 1;
//        while (x <= 100) {
//            System.out.println(x);
//            x++;
//        }

//        String word = "1";
//        while (true) {
//            System.out.println(word);
//            word = word + word;
//        }

//        boolean b = false;
//        while (b) {
//            System.out.println("asdfas");
//        }

//        do {
//            System.out.println("asdfas");
//        } while (b);

//        for (int i = 0; i < 100; i += 2) {
//            System.out.println(i);
//        }

//        int i = 0;
//        for (i = 0; i < 1000; i++) {
//            System.out.println(i);
//        }
//        System.out.println(i);


//        for (int i = 0; i < 150; i++) {
//            System.out.println(i);
//            if (i == 30) {
//                break;
//            }
//        }


//        for (int i = 1; i < 150; i++) {
//            System.out.println(i);
//            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
//                break;
//            }
//        }

//        for (int i = 0; i < 123; i++) {
//            System.out.println("i=" + i);
//            for (int j = 0; j < 122; j++) {
//                System.out.println("j=" + j);
//                break;
//            }
//        }


//        for (int i = 0; i < 100; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                System.out.println("Skipped " + i);
//                continue;
//            }
//            System.out.println(i);
//        }


        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j <= 1000; j++) {
                System.out.print("(" + i + ", " + j + ")\t");
            }
            System.out.println();
        }
    }
}
