package exercise;

public class ExerciseMainClass {

    public static void main(String[] args) {

//      Creating a new truck, Scania
        System.out.println("\n====== Truck part ======\n");
        Truck scaniaS770 = new Truck("Scania", "R770", 2022, 9980, 6,
                true, new Engine("S770", 770, 3700), 6854, "Flatbed",
                40_000, 1030);

        System.out.println(scaniaS770.getMark() + ", " + scaniaS770.getModel() + " can travel up to " +
                (int) scaniaS770.travelDistance() + " Km with one tank of fuel.");

        scaniaS770.truckInfo();

        System.out.println("\n====== Cargo handling part ======\n");
        System.out.println("Currently there is " + (double) scaniaS770.cargoLoaded + "Kg of cargo loaded.");
        scaniaS770.loadingCargo(false, 20_000);
        System.out.println("Currently there is " + (double) scaniaS770.cargoLoaded + "Kg of cargo loaded.");
        scaniaS770.unloadingCargo(true, 11000);
        System.out.println("Currently there is " + (double) scaniaS770.cargoLoaded + "Kg of cargo loaded.");


//      Creating a new engine, S770
        System.out.println("\n====== Engine part ======\n");
        Engine engine = new Engine("S770", 770, 3700);
        engine.printEngineInfo(1);
//        System.out.println(Arrays.toString(engine.engineHpToKw()));

//      Creating a new car, Ferrari
        System.out.println("\n====== Car part ======\n");
        Car ferrari = new Car("Ferrari", "FXX-K Evo", 2022, 1495, 4,
                true, new Engine("Beast", 1036, 990));

        System.out.println(String.format("%.1f", ferrari.fuelConsumption()) + "L / 100km");
        ferrari.accelerate();
        ferrari.brakes();
        ferrari.starts();
    }
}
