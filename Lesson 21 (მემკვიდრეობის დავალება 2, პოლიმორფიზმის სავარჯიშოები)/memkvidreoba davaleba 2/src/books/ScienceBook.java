package books;

public class ScienceBook extends Book{
    private String field;

    public ScienceBook(String title, int pages, String author, boolean isHardCover, String field) {
        super(title, pages, author, isHardCover);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
