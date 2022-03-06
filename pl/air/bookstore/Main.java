package pl.air.bookstore;

import pl.air.bookstore.model.Author;
import pl.air.bookstore.model.Book;
import pl.air.bookstore.model.Publisher;

public class Main {
	
	public static void main(String[] args) {
		// utwórz autorów
		Author fredro = new Author("Aleksander", "Fredro");
		Author mickiew = new Author("Adam", "Mickiewicz");
		mickiew.setBirth(1798);
		mickiew.setDeath(1855);

		Author wrycza = new Author("Stanisław", "Wrycza");
		Author marcinkowski = new Author("Bolesław", "Marcinkowski");
		Author wyrzykowski = new Author("Karol", "Wyrzykowski");
		Author maslankowski = new Author("Jacek", "Maślankowski");
		
		// utwórz wydawnictwa
		Publisher nk = new Publisher("Nasza Księgarnia");
		nk.setLocation("Warszawa");
		Publisher wsip = new Publisher("Wydawnictwa Szkolne i Pedagogiczne");
		Publisher helion = new Publisher("Helion");
		helion.setLocation("Gliwice");
		Publisher pwe = new Publisher("Polskie Wydawnictwo Ekonomiczne");
		Publisher pwn = new Publisher("Wydawnictwo Naukowe PWN");
		
		// utwórz książki
		Book zemsta = new Book("Zemsta");
		zemsta.setPublisher(nk);
		zemsta.addAuthors(fredro);
		
		Book sluby = new Book("Śluby panieńskie"); 
		sluby.setPublisher(wsip);
		sluby.addAuthors(fredro);
		
		Book panT = new Book("Pan Tadeusz");
		panT.setPublisher(nk);
		panT.addAuthors(mickiew);
		
		Book uml = new Book("Język UML 2.0 w modelowaniu systemów informatycznych");
		uml.setPublisher(helion);
		uml.addAuthors(wrycza, marcinkowski, wyrzykowski);

		Book infEkonom = new Book("Informatyka ekonomiczna. Teoria i zastosowania");
		infEkonom.setPublisher(pwn);
		infEkonom.addAuthors(wrycza, maslankowski);


		// wydrukuj informację o ksiązkach
		zemsta.printInfo();
		sluby.printInfo();
		panT.printInfo();
		uml.printInfo();
		infEkonom.printInfo();
	}

}
