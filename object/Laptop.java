package object;

public class Laptop extends Computer {
    private String os;
    private Integer weight;
    private String screenSize;

    public Laptop(String cpu, String model, Integer ram, Integer year, String os, Integer weight,
        String screenSize) {
        super(cpu, model, ram, year);
        this.os = os;
        this.weight = weight;
        this.screenSize = screenSize;
    }

    public Laptop() {
        super();
        this.os = "Windows";
        this.weight = 3;
        this.screenSize = "16\"";
    }
}
