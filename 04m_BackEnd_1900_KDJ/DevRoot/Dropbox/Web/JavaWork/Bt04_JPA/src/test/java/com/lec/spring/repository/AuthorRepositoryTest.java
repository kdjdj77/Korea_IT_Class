package com.lec.spring.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.lec.spring.domain.Author;
import com.lec.spring.domain.Book;
import com.lec.spring.domain.Writing;

@SpringBootTest
class AuthorRepositoryTest {
	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private WritingRepository writingRepository;
	
    @Test
    @Transactional
    void manyToManyTest() {
        System.out.println("\n-- TEST#manyToManyTest() ---------------------------------------------");
        
        Book book1 = givenBook("요리책1");
        Book book2 = givenBook("요리책2");
        Book book3 = givenBook("개발책1");
        Book book4 = givenBook("개발책2");
       
        Author author1 = givenAuthor("martin");
        Author author2 = givenAuthor("steve");
        
//        book1.addAuthor(author1);
//        book2.addAuthor(author2);
//        book3.addAuthor(author1, author2);
//        book4.addAuthor(author1, author2);
//        
//        author1.addBook(book1, book3, book4); // martin이 작성한 책들
//        author2.addBook(book2, book3, book4); // steve가 작성한 책들
        
        Writing writing1 = givenWriting(book1, author1);
        Writing writing2 = givenWriting(book2, author2);
        Writing writing3 = givenWriting(book3, author1);
        Writing writing4 = givenWriting(book3, author2);
        Writing writing5 = givenWriting(book4, author1);
        Writing writing6 = givenWriting(book4, author2);
        
        // book에 writing 매핑
        book1.addWritings(writing1);
        book2.addWritings(writing2);
        book3.addWritings(writing3, writing4);
        book4.addWritings(writing5, writing6);
        
        // author에 writing 매핑
        author1.addWritings(writing1, writing3, writing5);
        author2.addWritings(writing2, writing4, writing6);
        
        //book, author 저장
        bookRepository.saveAll(Lists.newArrayList(book1, book2, book3, book4));
        authorRepository.saveAll(Lists.newArrayList(author1, author2));
        
//        // 세 번째 책의 저자들 book -> author
//        System.out.println("authors through book : " + 
//        		bookRepository.findAll().get(2).getAuthors());
        System.out.println("authors through book : "); 
        bookRepository.findAll().get(2).getWritings().forEach(o -> System.out.println(o.getAuthor()));
//        // 첫 번째 저자의 책들 author -> book
//        System.out.println("book through authors : " + 
//        		authorRepository.findAll().get(0).getBooks());
        System.out.println("books through author : "); 
        authorRepository.findAll().get(0).getWritings().forEach(o -> System.out.println(o.getBook()));
//      
        System.out.println("\n------------------------------------------------------------\n");
    }

    // 테스트용 데이터 입력 메소드
    private Book givenBook(String name) {
        Book book = new Book();
        book.setName(name);
       
        return bookRepository.save(book); // INSERT
    }
    private Author givenAuthor(String name) {
        Author author = new Author();
        author.setName(name);
       
        return authorRepository.save(author); // INSERT
    }
    private Writing givenWriting(Book book, Author author) {
        Writing writing = new Writing();
        writing.setBook(book);
        writing.setAuthor(author);
       
        return writingRepository.save(writing);
    }

}
