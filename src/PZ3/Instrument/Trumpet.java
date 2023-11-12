package PZ3.Instrument;

public class Trumpet implements Instrument{

    double diameter;

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Trumpet is playing, diameter  is " + diameter  + " " + KEY);
    }
}
