package Mohamed_Adnan_assessment.library_assessment.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Entity
@Component
@Scope("prototype")
public class Borrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_borrowing;


    public LocalDate getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(LocalDate borrow_date) {
        this.borrow_date = borrow_date;
    }

    private LocalDate borrow_date;

    public LocalDate getReturn_date() {
        return return_date;
    }

    public void setReturn_date(LocalDate return_date) {
        this.return_date = return_date;
    }

    private LocalDate return_date;

    @ManyToOne
    @JoinColumn(name="id_book")
    private Book book_id;

    @ManyToOne
    @JoinColumn(name="id_patron")
    private Patron id_patron ;

    public Patron getId_patron() {
        return id_patron;
    }

    public void setId_patron(Patron id_patron) {
        this.id_patron = id_patron;
    }

    public Book getBook_id() {
        return book_id;
    }

    public void setBook_id(Book book_id) {
        this.book_id = book_id;
    }


    @Override
    public String toString() {
        return "Borrowing{" +
                "id_borrowing=" + id_borrowing +
                ", id_patron='" + id_patron + '\'' +
                ", book_id='" + book_id + '\'' +
                ", borrow_date='" + borrow_date + '\'' +
                ", return_date='" + return_date + '\'' +
                '}';
    }
}



