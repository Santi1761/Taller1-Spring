package icesi.edu.co.LibrarySystem.configurations;

import icesi.edu.co.LibrarySystem.persistence.models.Book;
import icesi.edu.co.LibrarySystem.persistence.models.Publisher;
import icesi.edu.co.LibrarySystem.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BookPersistence {
    private final BookService bookService;

    @Autowired
    public BookPersistence(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init() {
        Book book1 = new Book("Book Title", "Author Name", null);
        Book book2 = new Book("Book2", "Author2", null);
        Book book3 = new Book("Book3", "Author3", null);

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);
    }
}
