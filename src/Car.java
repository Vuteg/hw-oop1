public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        this.brand = brand == null || brand.isEmpty() ? "default" : brand;
        this.model = model == null || model.isEmpty() ? "default" : model;
        this.engineVolume = engineVolume > 0 ? engineVolume : 1.5;
        this.color = color == null || color.isEmpty() ? "white" : color;
        this.productionYear = productionYear > 0 ? productionYear : 2000;
        this.productionCountry = productionCountry == null || productionCountry.isEmpty() ? "default" : productionCountry;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return
                brand + " " + model +
                        ", production Year: " + productionYear +
                        ", production Country: " + productionCountry +
                        ", body color - " + color + ", engine Volume - " + engineVolume + "L.";
    }
}
