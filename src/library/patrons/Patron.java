package library.patrons;

import library.items.LibraryItem;
import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String id;
    private String name;
    private List<LibraryItem> borrowedItems; // Tracks borrowed items

    // Constructor
    public Patron(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    // Borrow an item
    public boolean borrowItem(LibraryItem item) {
        if (item.getCopiesAvailable() > 0) {
            borrowedItems.add(item);
            item.setCopiesAvailable(item.getCopiesAvailable() - 1);
            return true; // Successfully borrowed
        }
        return false; // No copies available
    }

    // Return an item
    public boolean returnItem(LibraryItem item) {
        if (borrowedItems.remove(item)) {
            item.setCopiesAvailable(item.getCopiesAvailable() + 1);
            return true; // Successfully returned
        }
        return false; // Item was not borrowed
    }

    @Override
    public String toString() {
        return "Patron{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", borrowedItems=" + borrowedItems +
                '}';
    }
}
