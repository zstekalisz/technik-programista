package pl.zste;

public class Srodek {
    Punkt p1;
    Punkt p2;
    int x;
    int y;

    public Srodek(Punkt p1, Punkt p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.x = (p1.x + p2.x)/2;
        this.y = (p1.y+ p2.y)/2;
    }

    @Override
    public String toString() {
        return "(" + p1.x + ", " +p1.y+ "), (" + this.x + ", " + this.y+ "), (" + p2.x + ", " +p2.y + ")";
    }
}
