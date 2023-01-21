package exercise;

public class Car extends Vehicle implements Movement, PrintingInterface{

    public Car(String mark, String model, int yearOfManufacture, int weight, int numOfTyres, boolean hasEngine,
               Engine engine) {
        super(mark, model, yearOfManufacture, weight, numOfTyres, hasEngine, engine);
    }

    @Override
    public void accelerate() {
        System.out.println("The " + getMark() + " " + getModel() + " is accelerating ...");
    }

    @Override
    public void brakes() {
        System.out.println("The " + getMark() + " " + getModel() + " is braking ...");

    }

    @Override
    public void starts() {
        if (isHasEngine()) {
            System.out.println("The car starts!");
        } else {
            System.out.println("Unfortunately the " + getMark() + getModel() + " can not start.");
        }

    }

    @Override
    public void printClassInfo() {
        System.out.println("PrintingClassInfo");
    }

    @Override
    public void printAdditionalInfo() {
        System.out.println("PrintingAdditionalInfo");
    }

    @Override
    public void printVehicleInfo() {
        System.out.println("PrintingVehicleInfo");
    }
}
