import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class BookingSystem {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();

    /*
    public static Band[] eventCreator(){
        System.out.println("Choose the number of bands to play at the event:");
        int numberBands = eventBands();
        System.out.println("Choose the lineup:");
        Band[] lineup = eventLineup(numberBands);
        return lineup;
    }

     */
    public static void printEvent(Band[] lineup, String eventName){
        System.out.println("Congratulations! The event \"" + eventName + "\" has been created and the lineup is as following:");
        System.out.println(Arrays.deepToString(lineup));
        double totalPlayingTime = 0;
        for (int i = 0; i < lineup.length; i++) {
            totalPlayingTime += lineup[i].getTime();
        }
        System.out.println("The total playtime of your event is: "+totalPlayingTime);

    }
    public static void bookingSystem(){
        Arrangement arrangementExample = new Arrangement();

        System.out.println("Welcome to Booking System!");
        arrangementExample.setArrangementName();
        System.out.println("Type in the number of bands to play at your event:");
        arrangementExample.setNumberBands();
        System.out.println("Choose the bands to play at your event:");
        arrangementExample.lineup(arrangementExample.getNumberBands());
        System.out.println(arrangementExample);
    }

    public static void main(String[] args) {
        bookingSystem();
    }
}
