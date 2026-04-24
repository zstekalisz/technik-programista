package pl.zste;

public class Zad1_1 {
    public static int licznik = 0;

    public static void main(String[] args) {
        System.out.println(przstaw(316498));
        System.out.println(licznik);
        licznik = 0;
        System.out.println(przstaw(43657688));
        System.out.println(licznik);
        licznik = 0;
        System.out.println(przstaw(154005710));
        System.out.println(licznik);
        licznik = 0;
        System.out.println(przstaw(998877665544321L));
        System.out.println(licznik);
        licznik = 0;

    }

    public static long przstaw(long n) {
        licznik++;
        long r = n%100;
        long a = r/10;
        long b = r%10;
        n= n/100;
        long w = 0;
        if(n>0){
            w = a+10*b + 100*przstaw(n);
        }else{
            if(a>0){
                w = a+10*b;
            }else{
                w=b;
            }
        }
        return w;
    }

}
/**
 * r   n mod 100
 *  a  r div 10
 * b  r mod 10
 * n  n div 100
 * jeżeli n > 0
 *  w  a + 10 * b + 100 * przestaw(n)
 *  w przeciwnym razie
 *   jeżeli a > 0
 *    w  a + 10 * b
 *   w przeciwnym razie
 * w  b
 *  wynikiem jest w
 */
