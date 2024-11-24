package library.items;

/**
 * Represents a book in the library system.
 * Extends the LibraryItem base class.
 */
public class Book extends LibraryItem {
    private String genre;

    // Constructor for initializing book-specific and common attributes
    public Book(String id, String title, String author, String isbn, String publisher, int copiesAvailable, String genre) {
        super(id, title, author, isbn, publisher, copiesAvailable);
        this.genre = genre;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Overrides the abstract method to specify item type
    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String toString() {
        return super.toString() + " (Genre: " + genre + ")";
    }
}
