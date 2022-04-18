package pl.krzychuuweb.workshop.car;

class CarObjectMotherTest {

    private Long id = 1L;
    private String registrationNumber = "BI1234";
    private int vehicleCategory = 1;
    private String mark = "Audi";
    private String model = "A3 8P";
    private String color = "Black";
    private String vinNumber = "1234567890";
    private float capacity = 1.6F;
    private int enginePower = 160;
    private int productionYear = 2012;

    public static CarObjectMotherTest newCar() {
        return new CarObjectMotherTest();
    }

    CarObjectMotherTest withId(Long id) {
        this.id = id;
        return this;
    }

    CarObjectMotherTest withRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    CarObjectMotherTest withVehicleCategory(int vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
        return this;
    }

    CarObjectMotherTest withMark(String mark) {
        this.mark = mark;
        return this;
    }

    CarObjectMotherTest withModel(String model) {
        this.model = model;
        return this;
    }

    CarObjectMotherTest withColor(String color) {
        this.color = color;
        return this;
    }

    CarObjectMotherTest withVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
        return this;
    }

    CarObjectMotherTest withCapacity(float capacity) {
        this.capacity = capacity;
        return this;
    }

    CarObjectMotherTest withEnginePower(int enginePower) {
        this.enginePower = enginePower;
        return this;
    }

    CarObjectMotherTest withProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    CarObjectMotherTest but() {
        return CarObjectMotherTest
                .newCar()
                .withId(id)
                .withRegistrationNumber(registrationNumber)
                .withVehicleCategory(vehicleCategory)
                .withMark(mark)
                .withModel(model)
                .withColor(color)
                .withVinNumber(vinNumber)
                .withCapacity(capacity)
                .withEnginePower(enginePower)
                .withProductionYear(productionYear);
    }

    Car build() {
        Car car = new Car();
        car.setId(id);
        car.setRegistrationNumber(registrationNumber);
        car.setVehicleCategory(vehicleCategory);
        car.setMark(mark);
        car.setModel(model);
        car.setColor(color);
        car.setVinNumber(vinNumber);
        car.setCapacity(capacity);
        car.setEnginePower(enginePower);
        car.setProductionYear(productionYear);

        return car;
    }
}
