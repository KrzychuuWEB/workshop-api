package pl.krzychuuweb.workshop.vehicle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.krzychuuweb.workshop.vehicle.dto.VehicleDTO;

import static pl.krzychuuweb.workshop.vehicle.VehicleDTOMapper.mapVehicleToVehicleDTO;

@RestController
@RequestMapping("/vehicles")
class VehicleController {

    private final VehicleFacade vehicleFacade;

    VehicleController(final VehicleFacade vehicleFacade) {
        this.vehicleFacade = vehicleFacade;
    }

    @GetMapping("/{registrationNumber}")
    VehicleDTO getByRegistrationNumber(@PathVariable String registrationNumber) {
        return mapVehicleToVehicleDTO(vehicleFacade.getVehicleByRegistrationNumber(registrationNumber));
    }
}
