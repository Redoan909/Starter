package startup;

public class Computer {
    
    int ram;
    float speed;
    int hdd;
    String name = "Hello";

    public Computer(int ram, float speed, int hdd) {
        this.ram = ram;
        this.speed = speed;
        this.hdd = hdd;
    }

    public Computer(int ram, float speed, int hdd, String name) {
        this.ram = ram;
        this.speed = speed;
        this.hdd = hdd;
        this.name = name;
    }
    
    public void printRam() {
        System.out.println(ram);
    }
}
