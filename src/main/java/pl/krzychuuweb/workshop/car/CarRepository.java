package pl.krzychuuweb.workshop.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CarRepository extends JpaRepository<Car, Long> {

}
