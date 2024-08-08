package Mohamed_Adnan_assessment.library_assessment.service;

import Mohamed_Adnan_assessment.library_assessment.model.Book;
import Mohamed_Adnan_assessment.library_assessment.model.Patron;
import Mohamed_Adnan_assessment.library_assessment.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class book_service {

    @Autowired
    BookRepo  br ;
    public List<Book> getall () {

        return br.findAll();
    }

    public Book getbook(int idBook) {
        return br.findById(idBook).orElseThrow();

    }

    public void addbook(Book book) {
        br.save(book);
    }

    public void updateBook(Book book) {
        br.save(book);
    }

    public void deletebook(int idBook) {
        br.deleteById(idBook);
    }
}
