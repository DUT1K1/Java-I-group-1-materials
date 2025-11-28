public class Main {
    public static void main(String[] args) {
        Book book = new Book(200, "J.R.R Tolkien", "The Hobbit");
        book.displayBookInfo();

        Book book2 = new Book("The Hobbit", "J.R.R Tolkien");
        book2.displayBookInfo();

        Rectangle rectangle = new Rectangle(10.3, 5.9);
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());
        System.out.println(rectangle.diagonal());
        System.out.println(rectangle.isSquare());
        rectangle.width = 10.3;
        System.out.println(rectangle.isSquare());

        Time time = new Time(12, 30, 45);
        time.displayTime();
        System.out.println();
        Time time2 = new Time(122, 30, 45);
        time2.displayTime();
        System.out.println();
        Time time3 = new Time(1, 5, 9);
        time3.displayTime();
    }
}
