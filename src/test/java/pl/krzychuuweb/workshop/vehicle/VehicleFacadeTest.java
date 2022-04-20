package pl.krzychuuweb.workshop.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.krzychuuweb.workshop.vehicle.exception.VehicleNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class VehicleFacadeTest {

    @Autowired
    private VehicleRepository vehicleRepository;
    private VehicleFacade vehicleFacade;

    @BeforeEach
    void setUp() {
        this.vehicleRepository = mock(VehicleRepository.class);
        this.vehicleFacade = new VehicleFacade(vehicleRepository);
    }

    @Test
    void should_get_vehicle_by_registration_number() {
        Vehicle vehicle = VehicleObjectMotherTest.newCar().build();

        when(vehicleRepository.getByRegistrationNumber(vehicle.getRegistrationNumber())).thenReturn(vehicle);

        Vehicle result = vehicleFacade.getVehicleByRegistrationNumber(vehicle.getRegistrationNumber());

        assertThat(result.getId()).isEqualTo(vehicle.getId());
        assertThat(result).isInstanceOf(Vehicle.class);
    }

    @Test
    void should_get_vehicle_by_registration_number_return_exception() {
        when(vehicleRepository.getByRegistrationNumber(anyString())).thenReturn(null);

        assertThrows(VehicleNotFoundException.class, () -> vehicleFacade.getVehicleByRegistrationNumber(anyString()));
    }
}