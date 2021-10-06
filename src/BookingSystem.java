import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class BookingSystem {
    static Scanner sc = new Scanner(System.in);

    public static String eventName(){
        String eventName = sc.nextLine();
        return eventName;
    }
    public static int eventBands(){
        boolean inputChecker = false;
        int numberBands = 0;

        while(!inputChecker){
            try{
                numberBands = sc.nextInt();
                inputChecker = true;
            }
            catch (InputMismatchException e){
                sc.next();
                System.out.println("Wrong input.");
                System.out.println("Plese type in the number of bands to play at the event.");
            }
        }

        return numberBands;
    }
    public static Band[] eventLineup(int numberBands){
        Band[] lineup = new Band[numberBands];
        System.out.println("Type \"0\" to book a band or type \"1\" to select a band who is already contracted:");
        int userChoice = sc.nextInt();

        for (int i = 0; i < lineup.length; i++) {
            boolean inputChecker = false;

            while(!inputChecker){
                if(userChoice == 0){
                    lineup[i] = createBand();
                    inputChecker = true;
                }
                else if(userChoice == 1){
                    lineup[i] = chooseBand();
                    inputChecker = true;
                }
                else{
                    System.out.println("Wrong input.");
                    System.out.println("Type \"0\" to book a band or type \"1\" to select a band who is already contracted:");
                    userChoice = sc.nextInt();
                }
            }
        }
        return lineup;
    }
    public static Band createBand(){
        System.out.println("Type in the name of the band:");
        String bandName = sc.nextLine();
        System.out.println("Type in how long the band should be on stage:");
        int bandTime = sc.nextInt();
        Band band = new Band(bandName,bandTime);
        return band;
    }
    public static Band chooseBand(){
        return null;
    }

    public static void eventCreator(){
        System.out.println("Type in the name of the event you would like to create:");
        String eventName = eventName();
        System.out.println("Choose the number of bands to play at the event:");
        int numberBands = eventBands();
        System.out.println("Choose the lineup:");
        Band[] lineup = eventLineup(numberBands);
        System.out.println(Arrays.toString(lineup));
    }

    public static void bookingSystem(){
        System.out.println("Welcome to Booking System!");
        eventCreator();

    }

    public static void main(String[] args) {
        /*
        Band systemOfADown = new Band("System Of A Down", 100000,1.5);
        Band dodoAndTheDodos = new Band("Dodo And The Dodos", 120000,1);
        Band nikOgJay = new Band("Nik Og Jay", 200000, 1.25);

        Band[] lineupOne = {systemOfADown,dodoAndTheDodos,nikOgJay};

        Arrangement firstConcert = new Arrangement(lineupOne,10000);

         */
        bookingSystem();
    }
}
