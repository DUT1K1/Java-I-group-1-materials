public class Book {
    String title;
    int pages;

    Book() {
        this.title = "Unknown";
        this.pages = 0;
    }

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    void display() {
        System.out.println("Title of the book: " + title
        + ", Number of pages: " + pages);
    }

    void addPages(int pages) {
        this.pages += pages;
    }
}
