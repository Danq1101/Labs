package PZ3.Instrument;

public class Drum implements Instrument{

    double size;

    public Drum(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Drum is playing, size is " + size + " " + KEY);
    }
}
