package PZ3.Animal;

public class Fish extends Animal{

    boolean checkVoice;
    public Fish(int age, double weight, String name, boolean checkVoice) {
        super(age, weight, name);
        this.checkVoice = checkVoice;
    }

    @Override
    public void voice() {
        System.out.println("voice");
    }

    public boolean isCheckVoice() {
        return checkVoice;
    }

    public void setCheckVoice(boolean checkVoice) {
        this.checkVoice = checkVoice;
    }
}
