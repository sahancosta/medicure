package com.mehmetpekdemir.librarymanagementsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.mehmetpekdemir.librarymanagementsystem.entity.Author;
import com.mehmetpekdemir.librarymanagementsystem.entity.Book;
import com.mehmetpekdemir.librarymanagementsystem.entity.Category;
import com.mehmetpekdemir.librarymanagementsystem.entity.Publisher;
import com.mehmetpekdemir.librarymanagementsystem.service.BookService;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LibrarymanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarymanagementsystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService) {
		return (args) -> {



		};
	}
}
