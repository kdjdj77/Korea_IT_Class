package com.lec.spring.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lec.spring.domain.Book;

@SpringBootTest
class BookRepositoryTest {
	@Autowired
	private BookRepository bookRepository;
	
	@Test
	void bookTest() {
        System.out.println("\n-- TEST#bookTest() ---------------------------------------------");
        Book book = new Book();
        book.setName("JPA 스터디");
        book.setAuthorId(1L);
        book.setPublisherId(1L);
        bookRepository.save(book); // INSERT
       
        System.out.println(bookRepository.findAll());
        System.out.println("\n------------------------------------------------------------\n");
	}
}
