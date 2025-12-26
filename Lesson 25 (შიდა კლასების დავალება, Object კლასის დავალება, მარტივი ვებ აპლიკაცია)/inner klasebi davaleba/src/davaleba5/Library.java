package davaleba5;

public class Library {
    private String id;
    private String name;

    public void printInfo() {
        class Book {
            private String bookId;
            private String bookName;

            public Book(String bookId, String bookName) {
                this.bookId = bookId;
                this.bookName = bookName;
            }

            public String getBookId() {
                return bookId;
            }

            public void setBookId(String bookId) {
                this.bookId = bookId;
            }

            public String getBookName() {
                return bookName;
            }

            public void setBookName(String bookName) {
                this.bookName = bookName;
            }

            @Override
            public String toString() {
                return "Book{" +
                        "bookId='" + bookId + '\'' +
                        ", bookName='" + bookName + '\'' +
                        '}';
            }
        }

        System.out.println("Library{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}');
    }
}
