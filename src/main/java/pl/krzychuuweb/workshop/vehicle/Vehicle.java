package pl.krzychuuweb.workshop.vehicle;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String registrationNumber;
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
