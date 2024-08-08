package Mohamed_Adnan_assessment.library_assessment.service;

import Mohamed_Adnan_assessment.library_assessment.model.Book;
import Mohamed_Adnan_assessment.library_assessment.model.Borrowing;
import Mohamed_Adnan_assessment.library_assessment.model.Patron;
import Mohamed_Adnan_assessment.library_assessment.repo.BookRepo;
import Mohamed_Adnan_assessment.library_assessment.repo.BorriwingRepo;
import Mohamed_Adnan_assessment.library_assessment.repo.PatronRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class borrowing_service {
    @Autowired
     BorriwingRepo brr;
    @Autowired
     Borrowing obj;

    @Autowired
    BookRepo BR;

    @Autowired
    PatronRepo Pr;

    public List<Borrowing> getall() {
        return brr.findAll();
    }

    public void Makeborrow(int book_id , int patron_id) {

        obj.setBook_id(BR.findById(book_id).orElseThrow());
        obj.setId_patron(Pr.findById(patron_id).orElseThrow());

        LocalDate currentDate = LocalDate.of(1999,8,15);

        obj.setBorrow_date(currentDate);

          brr.save(obj);

    }


    public void bookreturn(int bid, int pid) {

        obj = brr.bookreturn(BR.findById(bid).orElseThrow(),Pr.findById(pid).orElseThrow());

        LocalDate currentDate = LocalDate.now();
        obj.setReturn_date(currentDate);

        brr.save(obj);
    }


}
