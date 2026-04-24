public class Zad2_1 {

    static int licznik = 0;
    public static void main(String[] args) {
        System.out.println(obliczC(87654321012345678L));
        System.out.println(licznik);
    }

    /**
     * b = 1
     * c = 0
     * dopóki n > 0 wykonuj
     *  a = n mod 10
     *  n = n div 10
     *  jeżeli (a mod 2 = 0)
     *   c = c + b * (a div 2)
     *  w przeciwnym razie
     *   c = c + b
     *  b = b * 10
     * @param n
     * @return
     */
    public static long obliczC(long n){
        long b = 1;
        long c = 0;
        while (n>0){
            long a = n%10;
            n = n/10;
            if(a%2==0){
                c = c + b * (a/ 2);
            }else{
                c = c + b;
                licznik++;
            }
            b = b * 10;
        }
        return c;
    }
}
