import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(countDigits("asdf1132fs1"));
//        System.out.println(countSentences("Hello world! How are you?"));
//        System.out.println( isPalindrome("A man a plan a canal Panama"));
//        System.out.println(isSubstring("Hello world!", "happy"));

//        if (isLastCharacterVowel()) {
//            System.out.println("შემოსული სიტყვა ხმოვნით მთავრდება");
//        } else {
//            System.out.println("შემოსული სიტყვა თანხმოვნით მთავრდება");
//        }

//        System.out.println(reconstructOriginalString("hello"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(abbreviate(s));
    }

    static String abbreviate(String s) {
        if (s.length() > 10) {
            int middleNumber = s.length() - 2;
            return s.charAt(0) + String.valueOf(middleNumber) + s.charAt(s.length() - 1);
        } else {
            return s;
        }
    }

    static String reconstructOriginalString(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            sb.append(s.charAt(i));
            if (i + 1 < s.length() &&
            s.charAt(i) == s.charAt(i + 1)) {
                i += 2;
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    static boolean isLastCharacterVowel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine().toLowerCase();

        char lastChar = input.charAt(input.length() - 1);
        return "aeiou".indexOf(lastChar) != -1;
    }

    static boolean isSubstring(String s1, String s2) {
        return s1.contains(s2);
    }

    static boolean isPalindrome(String s) {
        // abcba
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    static int countSentences(String s) {
        int count = 0;
        String sentenceEndings = ".?!;";
        for (char c : s.toCharArray()) {
            if (sentenceEndings.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    static int countDigits(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
