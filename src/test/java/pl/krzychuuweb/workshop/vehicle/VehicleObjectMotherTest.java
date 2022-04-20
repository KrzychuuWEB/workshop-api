package pl.krzychuuweb.workshop.vehicle;

class VehicleObjectMotherTest {

    private Long id = 1L;
    private String registrationNumber = "BI1234";
    private String color = "Black";
    private String vinNumber = "1234567890";
    private float capacity = 1.6F;
    private int enginePower = 160;
    private int productionYear = 2012;

    public static VehicleObjectMotherTest newCar() {
        return new VehicleObjectMotherTest();
    }

    VehicleObjectMotherTest withId(Long id) {
        this.id = id;
        return this;
    }

    VehicleObjectMotherTest withRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    VehicleObjectMotherTest withColor(String color) {
        this.color = color;
        return this;
    }

    VehicleObjectMotherTest withVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
        return this;
    }

    VehicleObjectMotherTest withCapacity(float capacity) {
        this.capacity = capacity;
        return this;
    }

    VehicleObjectMotherTest withEnginePower(int enginePower) {
        this.enginePower = enginePower;
        return this;
    }

    VehicleObjectMotherTest withProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    VehicleObjectMotherTest but() {
        return VehicleObjectMotherTest
                .newCar()
                .withId(id)
                .withRegistrationNumber(registrationNumber)
                .withColor(color)
                .withVinNumber(vinNumber)
                .withCapacity(capacity)
                .withEnginePower(enginePower)
                .withProductionYear(productionYear);
    }

    Vehicle build() {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(id);
        vehicle.setRegistrationNumber(registrationNumber);
        vehicle.setColor(color);
        vehicle.setVinNumber(vinNumber);
        vehicle.setCapacity(capacity);
        vehicle.setEnginePower(enginePower);
        vehicle.setProductionYear(productionYear);

        return vehicle;
    }
}
