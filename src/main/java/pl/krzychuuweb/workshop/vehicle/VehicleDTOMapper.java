package pl.krzychuuweb.workshop.vehicle;

import pl.krzychuuweb.workshop.vehicle.dto.VehicleDTO;

class VehicleDTOMapper {

    static VehicleDTO mapVehicleToVehicleDTO(Vehicle vehicle) {
        return new VehicleDTO(vehicle.getId(), vehicle.getRegistrationNumber());
    }
}
