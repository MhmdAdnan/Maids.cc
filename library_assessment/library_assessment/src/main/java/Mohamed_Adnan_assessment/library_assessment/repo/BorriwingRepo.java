package Mohamed_Adnan_assessment.library_assessment.repo;

import Mohamed_Adnan_assessment.library_assessment.model.Book;
import Mohamed_Adnan_assessment.library_assessment.model.Borrowing;
import Mohamed_Adnan_assessment.library_assessment.model.Patron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface BorriwingRepo extends JpaRepository <Borrowing,Integer> {



@Query("select b from Borrowing b where b.book_id = ?1 and b.id_patron = ?2")
    Borrowing bookreturn(Book bid, Patron pid);


}
