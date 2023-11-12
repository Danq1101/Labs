package PZ3.Instrument;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(5);
        instruments[1] = new Drum(36.5);
        instruments[2] = new Trumpet(4.7);
        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
        }
    }
}
