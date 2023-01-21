package exercise;

public class Truck extends Vehicle implements CargoHandling {

    private int length;
    private String trailerType;
    private int loadCapacity;
    private int fuelTankCapacity;


    public Truck(String mark, String model, int yearOfManufacture, int weight, int numOfTyres, boolean hasEngine,
                 Engine engine, int length, String trailerType, int loadCapacity, int fuelTankCapacity) {
        super(mark, model, yearOfManufacture, weight, numOfTyres, hasEngine, engine);

        this.length = length;
        this.trailerType = trailerType;
        this.loadCapacity = loadCapacity;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public void truckInfo() {
        System.out.println(getMark() + ", " + getModel() + " was manufactured in " + getYearOfManufacture() +
                ". It has " + getNumOfTyres() + " wheels and can carry " + getLoadCapacity() + "kg of cargo.");
    }

    public double travelDistance() {
        if (getEngine()) {
            return (this.fuelTankCapacity / fuelConsumption()) * 100;
        }
        return 0;
    }

    int cargoLoaded;

    @Override
    public void loadingCargo(boolean hasCargo, int cargoToLoad) {

        if (!hasCargo) {
            if (cargoToLoad <= this.loadCapacity - this.getWeight() - cargoLoaded) {
                cargoLoaded += cargoToLoad;
            } else {
                System.out.println("Can't load that much cargo. Only " +
                        (this.loadCapacity - this.getWeight() - cargoLoaded) + "Kg can be loaded.");
            }
        } else {
            System.out.println("Trailer is already full.");
        }

    }

    @Override
    public void unloadingCargo(boolean hasCargo, int cargoToUnload) {

        if (hasCargo) {
            if (cargoToUnload <= cargoLoaded) {
                cargoLoaded -= cargoToUnload;
            } else {
                System.out.println("Can't unload that much cargo. Only " + cargoLoaded +
                        "Kg can be unloaded.");
            }
        } else {
            System.out.println("Trailer is already empty.");
        }

    }

    public String getTrailerType() {
        return trailerType;
    }

    public int getLength() {
        return length;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
