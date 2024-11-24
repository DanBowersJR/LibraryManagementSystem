package library;

import library.authors.Author;
import library.items.LibraryItem;
import library.patrons.Patron;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the library management system.
 */
public class LibrarySystem {
    private List<Author> authors;
    private List<LibraryItem> items;
    private List<Patron> patrons;

    // Constructor
    public LibrarySystem() {
        this.authors = new ArrayList<>();
        this.items = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Add an author to the library
    public void addAuthor(String name, String dateOfBirth) {
        Author author = new Author(name, dateOfBirth);
        authors.add(author);
        System.out.println("Author added: " + author);
    }

    // Add an item to the library
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added: " + item);
    }

    // Add a patron to the library
    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron added: " + patron);
    }

    // Get an item by ID
    public LibraryItem getItemById(String id) {
        for (LibraryItem item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    // Get a patron by ID
    public Patron getPatronById(String id) {
        for (Patron patron : patrons) {
            if (patron.getId().equals(id)) {
                return patron;
            }
        }
        return null;
    }

    // Delete a patron by ID
    public void deletePatronById(String id) {
        patrons.removeIf(patron -> patron.getId().equals(id));
        System.out.println("Patron with ID " + id + " deleted.");
    }

    // Display all items in the library
    public void displayItems() {
        System.out.println("\n=== Items in the Library ===");
        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }

    // Display all patrons in the library
    public void displayPatrons() {
        System.out.println("\n=== Patrons in the Library ===");
        for (Patron patron : patrons) {
            System.out.println(patron);
        }
    }

    // Display all authors in the library
    public void displayAuthors() {
        System.out.println("\n=== Authors in the Library ===");
        for (Author author : authors) {
            System.out.println(author);
        }
    }
}
