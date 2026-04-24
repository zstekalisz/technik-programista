import java.util.Comparator;

public class Srednia implements Comparable{
    int suma = 0;
    double ilosc = 0;
    double srednia = 0;
    int i = 0;


    public Srednia(int suma, double ilosc, int i) {
        this.suma = suma;
        this.ilosc = ilosc;
        if(this.ilosc>0){
            this.srednia = this.suma/this.ilosc;
        }
        this.i = i;
    }

    public Srednia(Srednia poprzedni, int liczba) {
        this.suma = poprzedni.suma+liczba;
        this.ilosc = poprzedni.ilosc+1;
        this.i = poprzedni.i;
        if(this.ilosc>0){
            this.srednia = this.suma/this.ilosc;
        }
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Srednia){
            Srednia p =(Srednia)o;
            if(p.srednia==this.srednia){
                return 0;
            }else if(p.srednia<this.srednia){
                return 1;
            }else return -1;
        }
        return 0;

    }

    @Override
    public String toString() {
        return this.srednia+" "+this.ilosc+" "+(this.i+1);
    }
}
