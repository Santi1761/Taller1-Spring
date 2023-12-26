package icesi.edu.co.LibrarySystem.services;

import icesi.edu.co.LibrarySystem.persistence.models.Book;
import icesi.edu.co.LibrarySystem.persistence.models.Publisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    private final List<Publisher> publishers; // Assuming you have a list of publishers

    public PublisherService(List<Publisher> publishers) {
        this.publishers = publishers;
    }

    // Method to list publishers with the number of books
    public List<Publisher> listPublishersWithBookCount() {
        for (Publisher publisher : publishers) {
            int bookCount = publisher.getBooks().size();
            publisher.setBookCount(bookCount); // Add a 'bookCount' field in the Publisher class
        }
        return publishers;
    }

    // Method to list books found in a specific publisher
    public List<Book> listBooksInPublisher(Long publisherId) {
        for (Publisher publisher : publishers) {
            if (publisher.getId().equals(publisherId)) {
                return publisher.getBooks();
            }
        }
        return null; // Return null if the publisher is not found
    }

    public void addPublisher(Publisher publisher) {
        publishers.add(publisher);
    }

    public List<Publisher> getAllPublishers() {
        return publishers;
    }
}
