package icesi.edu.co.LibrarySystem.persistence.models;

import java.util.List;

public class Publisher {
    private Long id;
    private String name;
    private String address;
    private List<Book> books;
    private int bookCount; // Add a field to store the book count


    // Constructors, getters, and setters

    public Publisher(Long id, String name, String address, List<Book> books) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public Publisher(String s, String name) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public int getBookCount() {
        return books.size();
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
}
