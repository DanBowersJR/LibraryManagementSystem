package library.items;

public class Book extends LibraryItem {
    private String genre; // Specific to books

    // Constructor
    public Book(String id, String title, String author, String isbn, String publisher, int copiesAvailable, String genre) {
        super(id, title, author, isbn, publisher, copiesAvailable);
        this.genre = genre;
    }

    // Getter and Setter for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", genre='" + genre + '\'' + "}";
    }
}
