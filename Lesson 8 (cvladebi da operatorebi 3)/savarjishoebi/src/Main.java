public class Main {
    public static void main(String[] args) {
        // N1
//        int a = 10;
//        int b = 15;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);


        // N2
//        double celsius = 20;
//        double fahrenheit = (celsius * 9 / 5) + 32;
//        System.out.println(fahrenheit);

        // N3
//        double radius = 5;
//        double area = Math.PI * radius * radius;
//        System.out.println("Area is " + area);

        // N4
//        int x = 5, y = 10;
//        int temp = x;
//        x = y;
//        y = temp;
//        System.out.println("x=" + x + ", y=" + y);

        // N5
//        int x0 = 0, y0 = 4, x1 = 3, y1=0;
//        double distance = Math.sqrt(
//                Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2)
//        );
//        System.out.println("Distance is " + distance);


        // N6
//        int number = 11;
//        if (number % 2 == 0) {
//            System.out.println(number + " არის ლუწი");
//        } else {
//            System.out.println(number + " არის კენტი");
//        }

        // N7
//        int num = 0;
//        if (num > 0) {
//            System.out.println(num + " არის დადებითი");
//        } else if (num < 0) {
//            System.out.println(num + " არის უარყოფითი");
//        } else {
//            System.out.println(num + " არის ნული");
//        }


        // N7
//        int year = 1900;
//        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
//            System.out.println("წელიწადი ნაკიანია");
//        } else {
//            System.out.println("წელიწადი არ არის ნაკიანი");
//        }

        // N8
        int score = 45;
        if (score >= 90) {
            System.out.println("A");
        }  else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        }  else if (score >= 50) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}
