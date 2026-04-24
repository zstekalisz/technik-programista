package pl.zste;

public class Zad1_3 {
    public static void main(String[] args) {
        System.out.println(przestaw2(316498L));
        System.out.println(przestaw2(43657688L));
        System.out.println(przestaw2(154005710L));
        System.out.println(przestaw2(998877665544321L));//94803282939
    }
    public static long przestaw2(long n){
        long w = 0;
        long wykladnik = 0;
        while(n>0){
            long r = n%100;
            long a = r/10;
            long b = r%10;
            n= n/100;
            if(n>0){
                a = a * (long)Math.pow(10, wykladnik);
                wykladnik++;
            }

            b = b * (int)Math.pow(10, wykladnik);
            wykladnik++;
            w = w + a + b;
        }
        return w;
    }
}
