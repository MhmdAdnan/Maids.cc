package Mohamed_Adnan_assessment.library_assessment.controller;

import Mohamed_Adnan_assessment.library_assessment.model.Book;
import Mohamed_Adnan_assessment.library_assessment.model.Borrowing;
import Mohamed_Adnan_assessment.library_assessment.service.book_service;
import Mohamed_Adnan_assessment.library_assessment.service.borrowing_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class borrowing_controller {
    @Autowired
    borrowing_service serborrowing;

    @GetMapping("/borrow")
    public List<Borrowing> borrows() {
        return serborrowing.getall();
    }

    @PostMapping("borrow/{bookId}/patron/{patronId}")
    public void Makeborrow(@PathVariable("bookId") int bookid , @PathVariable("patronId") int patronid) {
        serborrowing.Makeborrow(bookid,patronid);

    }
    @PutMapping("borrow/{bookId}/patron/{patronId}")
    public void bookreturn(@PathVariable("bookId") int bookid , @PathVariable("patronId") int patronid) {
        serborrowing.bookreturn(bookid,patronid);

    }





}
