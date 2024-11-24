package library.patrons;

import library.items.LibraryItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a patron in the library.
 */
public class Patron {
    private String id;
    private String name;
    private String role;
    private String address;
    private String phone;
    private List<LibraryItem> borrowedItems;

    // Constructor
    public Patron(String id, String name, String role, String address, String phone) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.address = address;
        this.phone = phone;
        this.borrowedItems = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    // Borrow an item
    public void borrowItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    // Return an item
    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    @Override
    public String toString() {
        return "Patron ID: " + id + "\nName: " + name + "\nRole: " + role + "\nAddress: " + address + "\nPhone: " + phone + "\nBorrowed Items: " + borrowedItems;
    }
}
