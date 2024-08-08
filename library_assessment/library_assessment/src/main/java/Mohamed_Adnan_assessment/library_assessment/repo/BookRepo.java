package Mohamed_Adnan_assessment.library_assessment.repo;

import Mohamed_Adnan_assessment.library_assessment.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepo extends JpaRepository< Book, Integer> {
}
