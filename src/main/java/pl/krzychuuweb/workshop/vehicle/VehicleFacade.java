package pl.krzychuuweb.workshop.vehicle;

import org.springframework.stereotype.Service;
import pl.krzychuuweb.workshop.vehicle.exception.VehicleNotFoundException;

import java.util.Optional;

@Service
public class VehicleFacade {

    private final VehicleRepository vehicleRepository;

    VehicleFacade(final VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle getVehicleByVinNumber(String vinNumber) {
        return Optional.ofNullable(vehicleRepository.getByVinNumber(vinNumber)).orElseThrow(
                () -> new VehicleNotFoundException("Vehicle with this vin number (" + vinNumber + ") not found!")
        );
    }
}
