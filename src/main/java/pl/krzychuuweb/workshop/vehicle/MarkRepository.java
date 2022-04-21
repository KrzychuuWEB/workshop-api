package pl.krzychuuweb.workshop.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface MarkRepository extends JpaRepository<Mark, Long> {
}
