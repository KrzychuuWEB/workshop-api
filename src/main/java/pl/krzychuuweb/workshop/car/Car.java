package pl.krzychuuweb.workshop.car;

import javax.persistence.*;

@Entity
@Table(name = "cars")
class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String registrationNumber;
    @Column(nullable = false)
    private int vehicleCategory;
    @Column(nullable = false)
    private String mark;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String vinNumber;
    @Column(nullable = false)
    private float capacity;
    @Column(nullable = false)
    private int enginePower;
    @Column(nullable = false)
    private int productionYear;

    public Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    void setRegistrationNumber(final String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getVehicleCategory() {
        return vehicleCategory;
    }

    void setVehicleCategory(final int vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getMark() {
        return mark;
    }

    void setMark(final String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    void setModel(final String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    void setColor(final String color) {
        this.color = color;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    void setVinNumber(final String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public float getCapacity() {
        return capacity;
    }

    void setCapacity(final float capacity) {
        this.capacity = capacity;
    }

    public int getEnginePower() {
        return enginePower;
    }

    void setEnginePower(final int enginePower) {
        this.enginePower = enginePower;
    }

    public int getProductionYear() {
        return productionYear;
    }

    void setProductionYear(final int productionYear) {
        this.productionYear = productionYear;
    }
}
