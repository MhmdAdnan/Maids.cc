package Mohamed_Adnan_assessment.library_assessment.service;

import Mohamed_Adnan_assessment.library_assessment.model.Patron;
import Mohamed_Adnan_assessment.library_assessment.repo.PatronRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class patron_service {

    @Autowired
    PatronRepo patronRepo;

    public List<Patron> getall() {
        return patronRepo.findAll();
    }

    public void addpatron(Patron patron) {
        patronRepo.save(patron);
    }

    public Patron getPatron(int idPatron) {
        return patronRepo.findById(idPatron).orElseThrow();
    }


    public void updatePatron(Patron idPatron) {
        patronRepo.save(idPatron);
    }

    public void deletepatron(int idPatron) {
        patronRepo.deleteById(idPatron);
    }

}
