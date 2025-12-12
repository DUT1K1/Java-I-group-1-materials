package books;

public class Book {
    private String title;
    private int pages;
    private String author;
    private boolean isHardCover;

    public Book(String title, int pages, String author, boolean isHardCover) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.isHardCover = isHardCover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", isHardCover=" + isHardCover +
                '}';
    }

    public void readBook() {
        System.out.println(
                "I am reading " + title + " by " + author
        );
    }
}
