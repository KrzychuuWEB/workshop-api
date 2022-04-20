package pl.krzychuuweb.workshop.vehicle;

import org.springframework.stereotype.Service;
import pl.krzychuuweb.workshop.vehicle.exception.VehicleNotFoundException;

import java.util.Optional;

@Service
public class VehicleFacade {

    private final VehicleRepository vehicleRepository;

    public VehicleFacade(final VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle getVehicleByRegistrationNumber(String registrationNumber) {
        return Optional.ofNullable(vehicleRepository.getByRegistrationNumber(registrationNumber)).orElseThrow(
                () -> new VehicleNotFoundException("Vehicle with this registration number (" + registrationNumber + ") not found!")
        );
    }
}
