package library.items;

/**
 * Abstract base class for all library items.
 */
public abstract class LibraryItem {
    private String id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int copiesAvailable;

    // Constructor for initializing common attributes
    public LibraryItem(String id, String title, String author, String isbn, String publisher, int copiesAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.copiesAvailable = copiesAvailable;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getItemType();

    @Override
    public String toString() {
        return title + " (" + getItemType() + ") by " + author;
    }
}
