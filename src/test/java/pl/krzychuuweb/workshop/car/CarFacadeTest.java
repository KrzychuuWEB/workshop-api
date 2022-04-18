package pl.krzychuuweb.workshop.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.krzychuuweb.workshop.car.exception.CarNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CarFacadeTest {

    @Autowired
    private CarRepository carRepository;
    private CarFacade carFacade;

    @BeforeEach
    void setUp() {
        this.carRepository = mock(CarRepository.class);
        this.carFacade = new CarFacade(carRepository);
    }

    @Test
    void should_get_car_by_registration_number() {
        Car car = CarObjectMotherTest.newCar().build();

        when(carRepository.getByRegistrationNumber(car.getRegistrationNumber())).thenReturn(car);

        Car result = carFacade.getCarByRegistrationNumber(car.getRegistrationNumber());

        assertThat(result.getId()).isEqualTo(car.getId());
        assertThat(result).isInstanceOf(Car.class);
    }

    @Test
    void should_get_car_by_registration_number_return_exception() {
        when(carRepository.getByRegistrationNumber(anyString())).thenReturn(null);

        assertThrows(CarNotFoundException.class, () -> carFacade.getCarByRegistrationNumber(anyString()));
    }
}