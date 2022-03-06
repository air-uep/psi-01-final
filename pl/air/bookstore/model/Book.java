package pl.air.bookstore.model;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private String title;
	private List<Author> authors;
	private Publisher publisher;

	
	// ********** Constructors **********
	public Book() {
		this.authors = new ArrayList<>();
	}
	public Book(String title) {
		this();
		this.title = title;
	}

	
	// ********** Business methods **********
	/*
	// pierwsza wersja metody - umożliwia dodane jednego autora
	public void addAuthor(Author author) {
		this.authors.add(author);
	}
    */

	// druga wersja metody - umożliwia dodanie dowolnej liczby autorów (także jednego)
	public void addAuthors(Author... authors) {
		for (Author a : authors) {
			this.authors.add(a);
		}
	}

	public void printInfo() {
		// tytuł
		System.out.println(title);

		// autorzy
		String authorOutput = null;
		// ustaw prefiks w zależności od liczby autorów
		if (authors.size() == 1) {
			authorOutput = " - autor: ";
		}
		else {
			authorOutput = " - autorzy: ";
		}
		// dodaj nazwiska autorów
		for (Author one : authors) {
			authorOutput += one.getFullName() + ", ";
		}
		// usuń ", " po ostatnim nazwisku
		authorOutput = authorOutput.substring(0, authorOutput.lastIndexOf(", "));
		// wydrukuj nazwiska autorów
		System.out.println(authorOutput);

		// wydawnictwo
		if (publisher != null) {
			System.out.println(" - wydawnictwo: " + publisher.getFullName());
		}
	}


	// ********** Getters & Setters **********
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

}
