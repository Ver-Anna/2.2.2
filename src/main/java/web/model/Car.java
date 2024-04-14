package web.model;

public class Car {
    private String model;
    private int series;
    private int maxSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }

    public Car(String model, int series, int maxSpeed) {
        this.model = model;
        this.series = series;
        this.maxSpeed = maxSpeed;
    }

    public Car() {
    }

    public String model() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int series() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int maxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
