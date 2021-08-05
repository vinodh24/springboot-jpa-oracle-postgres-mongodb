package com.vinodh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinodh.book.model.Book;
import com.vinodh.book.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book insertNewBookInfo(Book book) {
		bookRepository.findByBookName("vinodh").forEach(System.out::println);
		return bookRepository.save(book);
	}

}
