import object.Computer;
import object.Laptop;

public class App {
    public static void main(String[] args) {
        Computer com1 = new Computer("5GHz 8 core", "ASUS 8000", 32, 2024);
        com1.start();
        com1.displaySpec();
        com1.shutdown();
        
        Laptop com2 = new Laptop();
        com2.start();
        com2.shutdown();
    }
}
