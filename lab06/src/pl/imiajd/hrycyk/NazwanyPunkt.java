package pl.imiajd.hrycyk;

public class NazwanyPunkt extends Punkt {
    private String name;

    NazwanyPunkt(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public void show() {
        System.out.println(this.name + ":<" + this.x() + ", " + this.y() + ">");
    }
}
