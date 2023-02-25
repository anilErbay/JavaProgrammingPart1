package filesAndReadingData.storingRecordsPlanes;

public class Plane {
    private String manufacturer;
    private String model;
    private int productionYear;

    public Plane(String manufacturer, String model, int productionYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return "Manufacturer: '" + manufacturer + '\'' +
                ", Model: '" + model + '\'' +
                ", Production Year: " + productionYear +
                '}';
    }
}
