package pl.krzychuuweb.workshop.car;

import org.springframework.stereotype.Service;
import pl.krzychuuweb.workshop.car.exception.CarNotFoundException;

import java.util.Optional;

@Service
public class CarFacade {

    private final CarRepository carRepository;

    public CarFacade(final CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getCarByRegistrationNumber(String registrationNumber) {
        return Optional.ofNullable(carRepository.getByRegistrationNumber(registrationNumber)).orElseThrow(
                () -> new CarNotFoundException("Car with this registration number (" + registrationNumber + ") not found!")
        );
    }
}
