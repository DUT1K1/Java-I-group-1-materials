public class Davaleba {
    public static void main(String[] args) {
        // N1
//        double c = 12.3;
//        double f = c * (9.0 / 5.0) + 32;
//        System.out.println(f);

        // N2
//        double f = 54.14;
//        double c = (f - 32) * (5.0 / 9.0);
//        System.out.println(c);

        // N3
//        int year = 2016;
//        if (year % 400 == 0) {
//            System.out.println("ნაკიანია");
//        } else if (year % 100 == 0) {
//            System.out.println("არაა ნაკიანი");
//        } else if (year % 4 == 0) {
//            System.out.println("ნაკიანია");
//        } else {
//            System.out.println("არაა ნაკიანი");
//        }

        // N4
//        int x = 0;
//        int y = 0;
//
//        if (x == 0 && y == 0) {
//            System.out.println("საკოორდინატო სიბრტყის სათავეშია");
//        } else if (y == 0) {
//            System.out.println("X ღერძზეა");
//        } else if (x == 0) {
//            System.out.println("Y ღერძზეა");
//        } else if (x > 0 && y > 0) {
//            System.out.println("I");
//        } else if (x < 0 && y > 0) {
//            System.out.println("II");
//        } else if (x < 0 && y < 0) {
//            System.out.println("III");
//        } else if (x > 0 && y < 0) {
//            System.out.println("IV");
//        }

        // N5
        String op = "%";
        double a = 12;
        double b = 21;

        switch (op) {
            case "+":
                System.out.println(a + b);
                break;
            case  "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case  "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operation: " + op);
        }
    }
}
