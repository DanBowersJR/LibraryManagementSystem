package library.items;

public class Periodical extends LibraryItem {
    private String issueNumber; // Specific to periodicals
    private String publicationFrequency; // e.g., Weekly, Monthly

    // Constructor
    public Periodical(String id, String title, String author, String isbn, String publisher, int copiesAvailable, String issueNumber, String publicationFrequency) {
        super(id, title, author, isbn, publisher, copiesAvailable);
        this.issueNumber = issueNumber;
        this.publicationFrequency = publicationFrequency;
    }

    // Getters and Setters
    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublicationFrequency() {
        return publicationFrequency;
    }

    public void setPublicationFrequency(String publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }

    @Override
    public String toString() {
        return super.toString() + ", issueNumber='" + issueNumber + '\'' + ", publicationFrequency='" + publicationFrequency + '\'' + "}";
    }
}
