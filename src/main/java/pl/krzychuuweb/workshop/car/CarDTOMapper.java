package pl.krzychuuweb.workshop.car;

import pl.krzychuuweb.workshop.car.dto.CarDTO;

class CarDTOMapper {

    static CarDTO mapCarToCarDTO(Car car) {
        return new CarDTO(car.getId(), car.getRegistrationNumber());
    }
}
