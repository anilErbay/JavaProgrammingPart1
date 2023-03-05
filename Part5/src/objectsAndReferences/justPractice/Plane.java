package objectsAndReferences.justPractice;

public class Plane {
    private String manufacturer;
    private String model;
    private String registration;
    private ProductionDate productionDate;
    private FlightLogger loggedHours;

    public Plane(String manufacturer, String model, String registration, ProductionDate productionDate, FlightLogger loggedHours) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.registration = registration;
        this.productionDate = productionDate;
        this.loggedHours = loggedHours;
    }


}
