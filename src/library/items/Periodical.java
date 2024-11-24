package library.items;

/**
 * Represents a periodical (e.g., magazine, journal) in the library system.
 * Extends the LibraryItem base class and adds issue and frequency attributes.
 */
public class Periodical extends LibraryItem {
    private String issue;
    private String frequency;

    // Constructor for initializing periodical-specific and common attributes
    public Periodical(String id, String title, String author, String isbn, String publisher, int copiesAvailable, String issue, String frequency) {
        super(id, title, author, isbn, publisher, copiesAvailable);
        this.issue = issue;
        this.frequency = frequency;
    }

    // Getters for issue and frequency
    public String getIssue() {
        return issue;
    }

    public String getFrequency() {
        return frequency;
    }

    // Overrides the abstract method to specify item type
    @Override
    public String getItemType() {
        return "Periodical";
    }

    @Override
    public String toString() {
        return super.toString() + " (Issue: " + issue + ", Frequency: " + frequency + ")";
    }
}
