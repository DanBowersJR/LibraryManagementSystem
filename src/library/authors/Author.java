package library.authors;

import library.items.LibraryItem;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an author in the library system.
 */
public class Author {
    private String name;
    private String dateOfBirth;
    private List<LibraryItem> writtenItems;

    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.writtenItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<LibraryItem> getWrittenItems() {
        return writtenItems;
    }

    public void addWrittenItem(LibraryItem item) {
        writtenItems.add(item);
    }

    @Override
    public String toString() {
        return name + " (DOB: " + dateOfBirth + ")";
    }
}
