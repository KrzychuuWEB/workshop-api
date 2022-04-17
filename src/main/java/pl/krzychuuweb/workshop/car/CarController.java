package pl.krzychuuweb.workshop.car;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/cars")
class CarController {

    private final CarFacade carFacade;

    CarController(final CarFacade carFacade) {
        this.carFacade = carFacade;
    }


}
