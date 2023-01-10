//Часть 2. Задание 1.
public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        this.model = model;

        if (engineVolume <=0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume <=0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        this.productionCountry = productionCountry;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "default";
        } else  {
            this.color = color;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + productionYear + " года выпуска, сборка в " + productionCountry + ", " + color + " цвет кузова, объем двигателя — " + engineVolume + " л.";
    }
}