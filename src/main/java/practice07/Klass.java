package practice07;

public class Klass {
    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;

    public String getDisplayName() {
        return "Class " + this.number;
    }
}
