package pl.krzychuuweb.workshop.car;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.krzychuuweb.workshop.car.dto.CarDTO;

import static pl.krzychuuweb.workshop.car.CarDTOMapper.mapCarToCarDTO;

@RestController
@RequestMapping("/cars")
class CarController {

    private final CarFacade carFacade;

    CarController(final CarFacade carFacade) {
        this.carFacade = carFacade;
    }

    @GetMapping("/{registrationNumber}")
    CarDTO getByRegistrationNumber(@PathVariable String registrationNumber) {
        return mapCarToCarDTO(carFacade.getCarByRegistrationNumber(registrationNumber));
    }
}
