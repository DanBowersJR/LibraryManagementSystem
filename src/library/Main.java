package library;

import library.items.Book;
import library.items.Periodical;
import library.patrons.Patron;

public class Main {
    public static void main(String[] args) {
        // Create some Library Items
        Book book1 = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "Scribner", 5, "Fiction");
        Periodical periodical1 = new Periodical("2", "National Geographic", "Various", "000635929", "NatGeo", 10, "August 2024", "Monthly");

        // Create a Patron
        Patron patron = new Patron("P1", "Daniel Bowers");

        // Borrow Items
        System.out.println("Borrowing items:");
        if (patron.borrowItem(book1)) {
            System.out.println(patron.getName() + " successfully borrowed " + book1.getTitle());
        } else {
            System.out.println(book1.getTitle() + " is not available.");
        }

        if (patron.borrowItem(periodical1)) {
            System.out.println(patron.getName() + " successfully borrowed " + periodical1.getTitle());
        } else {
            System.out.println(periodical1.getTitle() + " is not available.");
        }

        // Print Patron Info
        System.out.println("\nPatron Info:");
        System.out.println(patron);

        // Return Items
        System.out.println("\nReturning items:");
        if (patron.returnItem(book1)) {
            System.out.println(patron.getName() + " successfully returned " + book1.getTitle());
        } else {
            System.out.println(book1.getTitle() + " was not borrowed.");
        }

        if (patron.returnItem(periodical1)) {
            System.out.println(patron.getName() + " successfully returned " + periodical1.getTitle());
        } else {
            System.out.println(periodical1.getTitle() + " was not borrowed.");
        }

        // Print Patron Info Again
        System.out.println("\nPatron Info after returning items:");
        System.out.println(patron);
    }
}
