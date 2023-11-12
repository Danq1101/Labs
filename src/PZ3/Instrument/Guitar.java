package PZ3.Instrument;

public class Guitar implements Instrument{

    int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Guitar is playing with " + numberOfStrings + " strings " + KEY);
    }
}
