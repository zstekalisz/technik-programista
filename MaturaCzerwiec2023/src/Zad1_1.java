public class Zad1_1 {

    public static int licznik = 0;

    /**
     *
     * iloczyn(x, y):
     * jeżeli y = 1
     * wynikiem jest x
     * w przeciwnym razie
     * k  y div 2
     * z  iloczyn(x, k)
     * jeżeli y mod 2 = 0
     * wynikiem jest z + z
     * w przeciwnym razie
     * wynikiem jest x + z + z
     * @param args
     */
    public static int iloczyn(int x, int y){
        if(y==1){
            return x;
        }else{
            int k = y/2;
            int z = iloczyn(x,k);
            if(y%2==0){
                licznik++;
                return z+z;
            }else{
                licznik+=2;
                return x+z+z;
            }
        }
    }
    public static void main(String[] args) {
        iloczyn(112, 112);
        System.out.println(licznik);
        System.out.println(iloczyn2(9,11));
    }

    public static int iloczyn2(int x, int y){
        int z = 0;
        while (y>=1){
            if(y%2==1){
                z = z+x;
            }
            x = x+x;
            y = y/2;
        }
        return z;
    }

}
