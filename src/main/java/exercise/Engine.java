package exercise;

public class Engine {

    private String name;
    private int output;
    private int torque;

    public Engine(String name, int output, int torque) {
        this.name = name;
        this.output = output;
        this.torque = torque;
    }

    String[] engineName = {"S770", "S660", "S590", "S530"};
    int[] engineOutputHP = {770, 660, 590, 530};
    int[] engineTorque = {3700, 3300, 3050, 2800};

    public void printEngineInfo(int choice) {

        if (choice > 0 && choice <= engineOutputHP.length) {
            System.out.println(engineName[choice - 1] + ", has a power output of " + engineOutputHP[choice - 1] +
                    "Hp (" + (int) (engineOutputHP[choice -1] * 0.73549875) + "Kw) and " + engineTorque[choice - 1] + "Nm of torque.");
        } else {
            System.out.println("Please enter a value from 1 to 4 inc.");
        }
    }

    public int[] engineHpToKw() {
        int[] engineOutputKw = new int[engineOutputHP.length];

        for (int i = 0; i < engineOutputHP.length; i++) {
            engineOutputKw[i] =  (int) (engineOutputHP[i] * 0.73549875);
        }
        return engineOutputKw;
    }

    public String getName() {
        return name;
    }

    public int getOutput() {
        return output;
    }

    public int getTorque() {
        return torque;
    }
}
