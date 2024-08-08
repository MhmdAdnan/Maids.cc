package Mohamed_Adnan_assessment.library_assessment.repo;

import Mohamed_Adnan_assessment.library_assessment.model.Patron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface PatronRepo extends JpaRepository< Patron,Integer> {
}
