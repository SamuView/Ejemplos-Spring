package com.example;

import java.util.List;

import com.example.model.Book;
import com.example.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		
		var repo = context.getBean(BookRepository.class);
		
		List<Book> books = List.of(
		    new Book(null, "book1", "author1", 10.0),
		    new Book(null, "book2", "author2", 33.0),
		    new Book(null, "book3", "author3", 11.0),
		    new Book(null, "book4", "author4", 25.05)
		);
		repo.saveAll(books);
	}

}
