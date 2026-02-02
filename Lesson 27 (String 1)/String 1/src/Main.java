import java.util.Arrays;

public class Main {
    static void main() {
//        String s1 = "Hello";
//        System.out.println(s1);
//        s1 += " World!";
//        System.out.println(s1);


//        String s2 = "Hello";
//        String s3 = new String("Hello");
//        String s5 = new String("Hello");
//        String s6 = new String("Hello");
//        System.out.println(s2);
//        System.out.println(s3);
//        String s4 = "Hello";
//        System.out.println(s2 == s4);
//        System.out.println(s2 == s3);
//        System.out.println(s3 == s4);
//        System.out.println("_________________________");
//        System.out.println(s2.equals(s4));
//        System.out.println(s2.equals(s3));
//        System.out.println(s3.equals(s4));
//        System.out.println("_________________________");
//        System.out.println(s4.intern());


//        String s1 = new String();
//        System.out.println(s1);
//        String s2 = new String("Sample String");
//        System.out.println(s2);
//        char[] word = {'H', 'e', 'l', 'l', 'o', '!'};
//        String s3 = new String(word);
//        System.out.println(s3);
//        byte[] bytes = {72, 101, 108, 108, 111, 33};
//        String s4 = new String(bytes);
//        System.out.println(s4);
//        StringBuilder sb = new StringBuilder(s4);
//        sb.reverse();
//        String s5 = new String(sb);
//        System.out.println(s5);



//        String s1 = "Hello World!";
//        System.out.println(s1.length());
//        System.out.println(s1.charAt(1));
//        String a = "AAA";
//        String b = "aaa";
//        System.out.println(a.compareTo(b));
//        System.out.println(a.compareToIgnoreCase(b));
//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(b));
//        System.out.println(s1.replace('l', 'x'));
//        System.out.println(s1.replaceAll("ll", "l"));
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.toLowerCase());
//        System.out.println(
//                Arrays.toString(s1.split(" "))
//        );
//        System.out.println(
//                Arrays.toString(s1.split("l"))
//        );
//        String bad = "    Hello   ";
//        System.out.println(bad);
//        System.out.println(bad.length());
//        System.out.println(bad.trim());
//        System.out.println(bad.length());
//        String good = bad.trim();
//        System.out.println(Arrays.toString(s1.toCharArray()));
//        System.out.println(Arrays.toString(s1.getBytes()));

        StringBuilder builder = new StringBuilder("Hello World!");
        builder.insert(6, "Java ");
        System.out.println(builder);


//        String a = "Hello World!";
//        System.out.println(a.substring(3));
//        System.out.println(a.substring(3, 8));
    }
}