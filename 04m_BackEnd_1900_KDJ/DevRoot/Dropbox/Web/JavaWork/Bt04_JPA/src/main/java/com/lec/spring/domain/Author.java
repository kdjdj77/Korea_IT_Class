package com.lec.spring.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class Author extends BaseEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String country;
	
//	@ManyToMany
//	@ToString.Exclude
//	private List<Book> books = new ArrayList<>();
//	
//	public void addBook(Book... book) {
//		Collections.addAll(this.books, book);
//	}
	
	@OneToMany
    @JoinColumn(name="author_id")
    @ToString.Exclude
    private List<Writing> writings = new ArrayList<>();
    public void addWritings(Writing...writings) {
    	Collections.addAll(this.writings, writings);
    }
}
