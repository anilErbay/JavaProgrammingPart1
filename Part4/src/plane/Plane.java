package plane;

import java.time.LocalDate;

public class Plane {
    private String manufacturer;
    private String model;
    private String registration;
    private LocalDate productionYear;

    public Plane(String manufacturer, String model, String registration, LocalDate productionYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.registration = registration;
        this.productionYear = productionYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getRegistration() {
        return registration;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }
    
    @Override
    public String toString() {
        return "Plane {" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", registration='" + registration + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
