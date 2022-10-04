package com.lec.spring.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lec.spring.domain.Book;
import com.lec.spring.domain.BookReviewInfo;

@SpringBootTest
class BookReviewInfoRepositoryTest {
	@Autowired
	private BookReviewInfoRepository bookReviewInfoRepository;
	@Autowired
	private BookRepository bookRepository;
//    @Test
//    void crudTest1() {
//        System.out.println("\n-- TEST#crudTest1() ---------------------------------------------");
//        
//        BookReviewInfo bookReviewInfo = new BookReviewInfo();
//        bookReviewInfo.setBookId(1L);
//        bookReviewInfo.setAverageReviewScore(4.5f);
//        bookReviewInfo.setReviewCount(2);
//        
//        bookReviewInfoRepository.save(bookReviewInfo); // INSERT
//        
//        System.out.println(">>> " + bookReviewInfoRepository.findAll());
//       
//        System.out.println("\n------------------------------------------------------------\n");
//    }
    
//    @Test
//    void crudTest2() {
//        System.out.println("\n-- TEST#crudTest2() ---------------------------------------------");
//   
//        // ① 새로운 Book 생성
//        Book book = new Book();
//        book.setName("JPA 완전정복");
//        book.setAuthorId(1L);
//        book.setPublisherId(1L);
//       
//        bookRepository.save(book); // INSERT
//        Long newBookId = book.getId();
//        System.out.println(">>> New Book Id : " + newBookId);
//        
//        // ② 새로운 BookReviewInfo 생성
//        BookReviewInfo bookReviewInfo = new BookReviewInfo();
//        bookReviewInfo.setBookId(newBookId);
//        bookReviewInfo.setAverageReviewScore(4.5f);
//        bookReviewInfo.setReviewCount(2);
//        
//        bookReviewInfoRepository.save(bookReviewInfo); // INSERT
//        Long newBookReviewId = bookReviewInfo.getId();
//        System.out.println(">>> New BookReviewInfo id : " + newBookReviewId);
//        
//        System.out.println(">>> " + bookReviewInfoRepository.findAll());
//        
//        // 특정 book review info에서 (부모)book의 정보 읽어오기
//        Long parentBookId = 
//        		bookReviewInfoRepository.findById(newBookReviewId).orElseThrow(RuntimeException::new).getBookId();
//        Book result = 
//        		bookRepository.findById(parentBookId).orElseThrow(RuntimeException::new);
//        System.out.println(">>> " + result);
//        		
//        
//        System.out.println("\n------------------------------------------------------------\n");
//    }
	
	// Book을 생성하는 로직을 별도로 작성
	private Book givenBook() {
	    // ① 새로운 Book 생성
	    Book book = new Book();
	    book.setName("JPA 완전정복");
	    book.setAuthorId(1L);
//	    book.setPublisherId(1L);
	   
	    // save() 의 리턴값은 Entity 다.
	    return bookRepository.save(book); // Book 에 INSERT
	}

	// BookReviewInf를 생성하는 로직을 별도로 작성
	private void givenBookReviewInfo() {
	    // ② 새로운 BookReviewInfo 생성
	    BookReviewInfo bookReviewInfo = new BookReviewInfo();
	    bookReviewInfo.setBook(givenBook()); // ★Book 에 연결★
	    bookReviewInfo.setAverageReviewScore(4.5f);
	    bookReviewInfo.setReviewCount(2);
	   
	    bookReviewInfoRepository.save(bookReviewInfo);  // BookReviewInfo 에 INSERT
	   
	    System.out.println(">>> " + bookReviewInfoRepository.findAll());
	}
	
	@Test
	void crudTest3() {
	    System.out.println("\n-- TEST#crudTest3() ---------------------------------------------");
	   
	    givenBookReviewInfo();
	   
	    // BookReviewInfo 에서 Book 정보 가져오기
	    Book result = bookReviewInfoRepository
	                  	.findById(1L)  // ★BookReviewInfo(id=1L)★
	                    .orElseThrow(RuntimeException::new)
	                    .getBook()  // ★1:1 연결된 Book Entity 를 직접 가져온다!★
	                    ;
	    
	    System.out.println(">>> " + result);
	    // Book에서 BookReviewInfo 정보 가져오기
	    BookReviewInfo result2 = bookRepository.findById(1L).orElseThrow(RuntimeException::new)
	    		.getBookReviewInfo()
	    		;
	    System.out.println(">>> " + result2);
	    System.out.println("\n------------------------------------------------------------\n");
	}



}
