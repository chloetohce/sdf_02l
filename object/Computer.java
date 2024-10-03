package object;

public class Computer {
    private String cpu;
    private String model; 
    private Integer ram;
    private Integer year;

    public Computer() {
        this.cpu = "5Ghz 8 core";
        this.model = "Gigabyte 1000";
        this.ram = 8;
        this.year = 2023;
    }
    
    public Computer(String cpu, String model, Integer ram, Integer year) {
        this.cpu = cpu;
        this.model = model;
        this.ram = ram;
        this.year = year;
    }

    public void start() {
        System.out.printf("Computer is starting.\n");
    }

    public  void shutdown() {
        System.out.println("Computer is shutting down.");
    }

    public void displaySpec() {
        System.out.printf("Computer specifications are: \nCPU: %s\nModel: %s\nRAM: %s\nYear: %s\n",
            cpu, model, ram, year);
    }
}