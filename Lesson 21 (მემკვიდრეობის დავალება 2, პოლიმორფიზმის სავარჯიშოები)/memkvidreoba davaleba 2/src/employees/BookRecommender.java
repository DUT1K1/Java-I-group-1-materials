package employees;

import books.Book;
import library.Library;

import java.util.Random;

public class BookRecommender extends LibraryEmployee{
    private double rating;
    private Library library;

    public BookRecommender(String id, String firstName, String lastName, double rating) {
        super(id, firstName, lastName);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "BookRecommender{" +
                "rating=" + rating +
                ", library=" + library +
                "} " + super.toString();
    }

    public Book recommendMeABook() {
        Random random = new Random();
        int index = random.nextInt(library.getBooks().length);
        return library.getBooks()[index];
    }
}
