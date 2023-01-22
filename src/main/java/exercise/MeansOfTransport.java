package exercise;

public abstract class MeansOfTransport {
    private final String mark;
    private final String model;
    private final int yearOfManufacture;
    private final int weight;


    public MeansOfTransport(String mark, String model, int yearOfManufacture, int weight) {
        this.mark = mark;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.weight = weight;
    }

    public void printMarkModel() {
        System.out.println("The mark of the vehicle is " + this.mark + " and model is " + this.model + ".");
    }

    public void ageOfVehicle() {
        System.out.println("The vehicle is " + (2023 - this.yearOfManufacture));
    }

    public void getAge() {
        System.out.println("The vehicle was manufactured in " + this.yearOfManufacture);
    }


    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getWeight() {
        return weight;
    }
}
