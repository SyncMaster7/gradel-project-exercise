package exercise;

public class Car extends Vehicle {

    private int numOfTyres;
    private boolean hasEngine;


    public Car(String mark, String model, int yearOfManufacture, int weight, int numOfTyres, boolean hasEngine) {
        super(mark, model, yearOfManufacture, weight);

        this.numOfTyres = numOfTyres;
        this.hasEngine = hasEngine;
    }

    public void getTyreCount() {
        System.out.println("There are " + this.numOfTyres + " tyres on that car.");
    }

    public boolean getEngine() {

        if (hasEngine) {
            return true;
        } else {
            return false;
        }
    }

    public double fuelConsumption() {
        if (hasEngine) {
            return (double) getWeight() / 285;
        }
        return 0;
    }

    public int getNumOfTyres() {
        return numOfTyres;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }
}
