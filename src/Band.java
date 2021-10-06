import java.util.Random;


public class Band {
    static Random rd = new Random();
    private String name;
    private int pricePerTicket;
    private double time;

    public Band(String name, double time) {
        this.pricePerTicket = (int) (Math.random() * (300 - 100)) + 100;
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", pricePerTicket=" + pricePerTicket +
                ", time=" + time +
                '}';
    }
}
