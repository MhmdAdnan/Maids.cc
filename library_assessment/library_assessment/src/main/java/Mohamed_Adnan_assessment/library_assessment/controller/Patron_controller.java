package Mohamed_Adnan_assessment.library_assessment.controller;

import Mohamed_Adnan_assessment.library_assessment.model.Patron;
import Mohamed_Adnan_assessment.library_assessment.service.patron_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Patron_controller {

    @Autowired
    patron_service serpatron;

    @GetMapping("patron")
    public List<Patron> patron() {
        return serpatron.getall();
    }

    @GetMapping("/patron/{id_patron}")
    public Patron getPatron(@PathVariable int id_patron) {
        return serpatron.getPatron(id_patron);
    }

    @PostMapping("patron")
    public void addPatron(@RequestBody Patron patron) {
        serpatron.addpatron(patron);

    }
    @PutMapping("patron")
    public void updatePatron(@RequestBody Patron patron) {
        serpatron.updatePatron(patron);

    }


    @DeleteMapping("patron/{id_patron}")
    public void deletepatron(@PathVariable int id_patron)
    {
        serpatron.deletepatron(id_patron);

    }
}
