import java.util.Arrays;

public class Arrangement {
    private Band[] bandArr;
    private int numberBands;
    private int availableTickets;
    private double playingTime;

    public Arrangement(Band[] bandArr, int availableTickets) {
        this.numberBands = bandArr.length;
        this.bandArr = bandArr;
        this.availableTickets = availableTickets;
    }

    public Band[] getBandArr() {
        return bandArr;
    }
    public int getNumberBands() {
        return numberBands;
    }
    public int getAvailableTickets() {
        return availableTickets;
    }
    public double getPlayingTime() {
        return playingTime;
    }

    public void setBandArr(Band[] bandArr) {
        this.bandArr = bandArr;
    }
    public void setNumberBands(int numberBands) {
        this.numberBands = numberBands;
    }
    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }
    public void setPlayingTime(double playingTime) {
        this.playingTime = playingTime;
    }

    @Override
    public String toString() {
        return "Arrangement{" +
                "bandArr=" + Arrays.toString(bandArr) +
                ", numberBands=" + numberBands +
                ", availableTickets=" + availableTickets +
                ", playingTime=" + playingTime +
                '}';
    }
}
