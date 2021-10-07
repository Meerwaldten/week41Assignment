import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrangement {
    static Scanner sc = new Scanner(System.in);
    private String arrangementName;
    private Band[] lineup;
    private int numberBands;
    private int availableTickets;
    private double playingTime;

    public Arrangement() {
    }

    public String getArrangementName() {
        return arrangementName;
    }

    public void setArrangementName() {
        System.out.println("Please type in the name of the event:");
        this.arrangementName = sc.nextLine();
    }

    public Band[] getlineup() {
        return lineup;
    }

    public void setlineup(Band[] lineup) {
        this.lineup = lineup;
    }

    public int getNumberBands() {
        return numberBands;
    }

    public void setNumberBands() {
        boolean inputChecker = false;
        numberBands = 0;

        while(!inputChecker){
            try{
                this.numberBands = sc.nextInt();
                inputChecker = true;
            }
            catch (InputMismatchException e){
                sc.next();
                System.out.println("Wrong input.");
                System.out.println("Please type in the number of bands to play at the event.");
            }
        }
        Band[] bandExample = new Band[numberBands];
        this.lineup = bandExample;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public double getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(double playingTime) {
        this.playingTime = playingTime;
    }

    public void lineup(int numberBands){
        for (int i = 0; i < numberBands; i++) {
            boolean inputChecker = false;

            while(!inputChecker){
                System.out.println("Type \"0\" to book a band or type \"1\" to select a band who is already contracted:");
                int userChoice = sc.nextInt();
                Band bandExample = new Band("",0,0);
                if(userChoice == 0){
                    this.lineup[i] = bandExample.createBand();
                    System.out.println(lineup[i]);
                    inputChecker = true;
                }
                else if(userChoice == 1){
                    this.lineup[i] = bandExample.chooseBand();
                    inputChecker = true;
                }
                else{
                    System.out.println("Wrong input.");
                    System.out.println("Type \"0\" to book a band or type \"1\" to select a band who is already contracted:");
                    userChoice = sc.nextInt();
                }
            }
        }
    }

    @Override
    public String toString() {
        for (Band bands : lineup) {
            System.out.println(bands);

        }
        return "";
    }
}
