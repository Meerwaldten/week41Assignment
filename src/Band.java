import java.util.Random;
import java.util.Scanner;

public class Band {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    private String name;
    private int pricePerTicket;
    private double time;

    public Band(String name, double time, int pricePerTicket) {
        this.pricePerTicket = pricePerTicket;
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getPricePerTicket() {
        return pricePerTicket;
    }

    public double getTime() {
        return time;
    }

    public Band createBand(){
        System.out.println("Type in the name of the band:");
        name = sc.nextLine();
        System.out.println("Type in how long the band should be on stage:");
        time = sc.nextInt();
        System.out.println("The band informs you their price per ticket for booking them will be:");
        pricePerTicket = (int) (Math.random() * (300-150))+150;
        System.out.println(pricePerTicket + " DKK.");
        Band newBand = new Band(name, time, pricePerTicket);
        sc.nextLine();
        return newBand;
    }
    public Band chooseBand(){
        System.out.println("The following bands are available for booking:");
        Band rockBand01 = new Band("System Of A Down", 1,300);
        Band popBand01 = new Band("Ace of Base", 1.5,250);
        Band popBand02 = new Band("Dodo And The Dodos",1.25,200);
        Band popBand03 = new Band("Nik Og Jay", 1,350);
        Band electronicBand01 = new Band("Major Lazer", 2,400);
        Band[] listOfHouseBands = {rockBand01, popBand01, popBand02, popBand03, electronicBand01};
        for (int i = 0; i < listOfHouseBands.length; i++) {
            System.out.println("type "+(i+1)+" for "+listOfHouseBands[i]);
        }
        Band bandChoice = listOfHouseBands[sc.nextInt()-1];
        return bandChoice;
    }

    @Override
    public String toString() {
        return name + ", who is playing for "+time+" hours, and they cost "+pricePerTicket+" pr ticket.";
    }
}
