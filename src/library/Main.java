package library;

import library.items.Book;
import library.items.Periodical;
import library.patrons.Patron;

public class Main {
    public static void main(String[] args) {
        LibrarySystem system = new LibrarySystem();

        // Add authors
        system.addAuthor("F. Scott Fitzgerald", "1896-09-24");
        system.addAuthor("George Orwell", "1903-06-25");

        // Add items to the library
        system.addItem(new Book("1", "The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "Scribner", 5, "Fiction"));
        system.addItem(new Book("2", "1984", "George Orwell", "9780451524935", "Secker & Warburg", 3, "Dystopian"));
        system.addItem(new Periodical("3", "National Geographic", "Various", "000635929", "NatGeo", 10, "August 2024", "Monthly"));

        // Add patrons
        system.addPatron(new Patron("P1", "Alice Smith", "Student", "123 Maple St", "555-1234"));
        system.addPatron(new Patron("P2", "Bob Johnson", "Employee", "456 Oak St", "555-5678"));

        // Display items and patrons
        system.displayItems();
        system.displayPatrons();

        // Borrow items
        Patron alice = system.getPatronById("P1");
        alice.borrowItem(system.getItemById("1"));
        alice.borrowItem(system.getItemById("2"));
        system.displayPatrons();

        // Return items
        alice.returnItem(system.getItemById("2"));
        system.displayPatrons();

        // Delete a patron
        system.deletePatronById("P1");
        system.displayPatrons();
    }
}
