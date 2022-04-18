package pl.krzychuuweb.workshop.car.exception;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException(final String message) {
        super(message);
    }
}
