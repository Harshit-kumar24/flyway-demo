package com.harshit.flyway;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.harshit.flyway.repository.BookRepository;

@SpringBootApplication
public class FlywayApplication implements CommandLineRunner {

	private final BookRepository bookRepository;

	public FlywayApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(FlywayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepository.findAll().forEach(book -> {
			System.out.println(book.toString());
		});

	}

}
