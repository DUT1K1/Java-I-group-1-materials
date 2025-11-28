public class Book {
    String title;
    String author;
    int pages;

    public Book(int pages, String author, String title) {
        this.pages = pages;
        this.author = author;
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    void displayBookInfo() {
        System.out.println(title + " by " + author + " has " + pages + " pages.");
    }
}
