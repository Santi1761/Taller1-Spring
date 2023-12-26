package icesi.edu.co.LibrarySystem.configurations;

import icesi.edu.co.LibrarySystem.persistence.models.Book;
import icesi.edu.co.LibrarySystem.persistence.models.Publisher;
import icesi.edu.co.LibrarySystem.services.PublisherService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class PublisherInitializer {

    private final PublisherService publisherService;

    public PublisherInitializer(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @PostConstruct
    public void initializePublishers() {
        // Create Publisher instances
        Publisher publisher1 = new Publisher("Publisher 1", "Address 1");
        Publisher publisher2 = new Publisher("Publisher 2", "Address 2");
        Publisher publisher3 = new Publisher("Publisher 3", "Address 3");

        // Create Book instances
        List<Book> booksPublisher1 = new ArrayList<>();
        booksPublisher1.add(new Book("Book 1", "Author 1", publisher1));
        booksPublisher1.add(new Book("Book 2", "Author 2", publisher1));
        booksPublisher1.add(new Book("Book 3", "Author 3", publisher1));
        booksPublisher1.add(new Book("Book 4", "Author 4", publisher1));
        booksPublisher1.add(new Book("Book 5", "Author 5", publisher1));

        List<Book> booksPublisher2 = new ArrayList<>();
        booksPublisher2.add(new Book("Book 6", "Author 6", publisher2));
        booksPublisher2.add(new Book("Book 7", "Author 7", publisher2));
        booksPublisher2.add(new Book("Book 8", "Author 8", publisher2));
        booksPublisher2.add(new Book("Book 9", "Author 9", publisher2));
        booksPublisher2.add(new Book("Book 10", "Author 10", publisher2));

        List<Book> booksPublisher3 = new ArrayList<>();
        booksPublisher3.add(new Book("Book 11", "Author 11", publisher3));
        booksPublisher3.add(new Book("Book 12", "Author 12", publisher3));
        booksPublisher3.add(new Book("Book 13", "Author 13", publisher3));
        booksPublisher3.add(new Book("Book 14", "Author 14", publisher3));
        booksPublisher3.add(new Book("Book 15", "Author 15", publisher3));

        // Set books for each publisher
        publisher1.setBooks(booksPublisher1);
        publisher2.setBooks(booksPublisher2);
        publisher3.setBooks(booksPublisher3);

        // Save publishers to the service
        publisherService.addPublisher(publisher1);
        publisherService.addPublisher(publisher2);
        publisherService.addPublisher(publisher3);
    }
}
