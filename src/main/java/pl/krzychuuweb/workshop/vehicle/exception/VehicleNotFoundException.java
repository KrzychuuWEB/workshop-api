package pl.krzychuuweb.workshop.vehicle.exception;

public class VehicleNotFoundException extends RuntimeException {

    public VehicleNotFoundException(final String message) {
        super(message);
    }
}
