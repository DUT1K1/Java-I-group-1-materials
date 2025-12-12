import books.AdventureBook;
import books.Book;
import books.FantasyBook;
import books.ScienceBook;
import employees.BookGiver;
import employees.BookOrganizer;
import employees.BookRecommender;
import employees.LibraryEmployee;
import employees.NoisePolice;
import library.Library;

public class Main {
    public static void main(String[] args) {
        AdventureBook adventureBook = new AdventureBook("The Lord of the Rings", 1000, "", true);
        FantasyBook fantasyBook = new FantasyBook("The Hobbit", 100, "", false, "England");
        ScienceBook scienceBook = new ScienceBook("The Martian", 1000, "", true, "Physics");
        Book[] books = {adventureBook, fantasyBook, scienceBook};

        BookRecommender bookRecommender = new BookRecommender("1", "John", "Doe", 5.0);
        BookOrganizer bookOrganizer = new BookOrganizer("2", "Jane", "Doe");
        BookGiver bookGiver = new BookGiver("3", "Some", "One", "09:00", "18:00");
        NoisePolice noisePolice = new NoisePolice("4", "Davit", "Maisuradze", 4.5);
        LibraryEmployee[] employees = {bookRecommender, bookOrganizer, bookGiver, noisePolice};

        Library library = new Library("Library", employees, books);
        bookRecommender.setLibrary(library);

        System.out.println(bookRecommender.recommendMeABook());
    }
}
