package Mohamed_Adnan_assessment.library_assessment.controller;


import Mohamed_Adnan_assessment.library_assessment.model.Book;
import Mohamed_Adnan_assessment.library_assessment.model.Patron;
import Mohamed_Adnan_assessment.library_assessment.service.book_service;
import Mohamed_Adnan_assessment.library_assessment.service.patron_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class book_controller {

    @Autowired
    book_service serbook;

    @GetMapping("/book")
    public List<Book> book() {
        System.out.println(serbook.getall());
        return serbook.getall();
    }

    @GetMapping("/book/{id_book}")
    public Book getbook(@PathVariable int id_book) {
        return serbook.getbook(id_book);
    }

    @PostMapping("/book")
    public void addbook(@RequestBody Book book) {
        serbook.addbook(book);

    }
    @PutMapping("/book")
    public void updatebook(@RequestBody Book book) {
        serbook.updateBook(book);

    }


    @DeleteMapping("/book/{id_book}")
    public void deletebook(@PathVariable int id_book)
    {
        serbook.deletebook(id_book);

    }




}
