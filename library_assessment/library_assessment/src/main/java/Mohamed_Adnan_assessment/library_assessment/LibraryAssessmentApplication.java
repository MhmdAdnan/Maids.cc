package Mohamed_Adnan_assessment.library_assessment;

import Mohamed_Adnan_assessment.library_assessment.model.Book;
import Mohamed_Adnan_assessment.library_assessment.model.Patron;
import Mohamed_Adnan_assessment.library_assessment.repo.BookRepo;
import Mohamed_Adnan_assessment.library_assessment.repo.PatronRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LibraryAssessmentApplication {

	public static void main(String[] args) {
		ApplicationContext CT = SpringApplication.run(LibraryAssessmentApplication.class, args);

		PatronRepo repo_patron = CT.getBean(PatronRepo.class);
		List<Patron>patrons = new ArrayList<Patron>();

		Patron patron = CT.getBean(Patron.class);
		Patron patron2 = CT.getBean(Patron.class);

		patron.setId_patron(1);
		patron.setName("Mohamed Adnan");
		patron.setContact_info("01156667504");

		patrons.add(patron);

		patron2.setId_patron(2);
		patron2.setName("adnan ibrahim");
		patron2.setContact_info("01006580711");

		patrons.add(patron2);
		System.out.println(patrons);
		repo_patron.saveAll(patrons);

		System.out.println();
		//////////////////////////////////////////////////////////

		BookRepo repo_book = CT.getBean(BookRepo.class);
		List<Book>books = new ArrayList<Book>();

		Book  book = CT.getBean(Book.class);
		Book  book2 = CT.getBean(Book.class);
		book.setId_book(1);
		book.setAuthor("Mostafa Mohamed");
		book.setTitle("How to play football");
		book.setPublication_year(2012);
		book.setISBN(231);

		books.add(book);

		book2.setId_book(2);
		book2.setAuthor("Aldsouky");
		book2.setTitle("How to write a java code");
		book2.setPublication_year(2001);
		book2.setISBN(123);

		books.add(book2);

		repo_book.saveAll(books);









	}


}
