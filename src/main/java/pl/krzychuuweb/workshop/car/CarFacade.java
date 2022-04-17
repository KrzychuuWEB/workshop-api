package pl.krzychuuweb.workshop.car;

import org.springframework.stereotype.Service;

@Service
public class CarFacade {

    private final CarRepository carRepository;

    public CarFacade(final CarRepository carRepository) {
        this.carRepository = carRepository;
    }


}
