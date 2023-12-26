package icesi.edu.co.LibrarySystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibrarySystemApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LibrarySystemApplication.class, args);
	}
}
