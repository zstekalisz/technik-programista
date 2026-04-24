public class Zad1_3 {

    /**
     * A(i, j)
     *     wypisz numer książki z przegródki B[i, j]
     *     jeżeli przegródka B[i + 1, 2j – 1] nie jest pusta, to
     *  wykonaj A(i + 1, 2j – 1)
     *     jeżeli przegródka B[i + 1, 2j] nie jest pusta, to
     *  wykonaj A(i + 1, 2j)
     * @param tab
     * @param i
     * @param j
     */
    public static void wykonaj(int[][] tab, int i , int j){
        if(tab[i][j]!=0){
            System.out.print(tab[i][j]+" ");
        }
        if(tab[i+1][2*j-1]!=0){
            wykonaj(tab, (i+1), (j*2-1));
        }
        if(tab[i+1][2*j]!=0){
            wykonaj(tab, (i+1), (j*2));
        }
    }

    public static void main(String[] args) {
        int[][] tab = new int[5][17];
        tab[0][1] =9;
        tab[1][1] =2;
        tab[1][2] =12;
        tab[2][3] =10;
        tab[2][4] =14;
        tab[3][7] =13;
        tab[3][8] =15;
        wykonaj(tab, 0, 1);
        System.out.println(" ");

        int[][] tab2 = new int[5][17];
        tab2[0][1] =10;
        tab2[1][1] =8;
        tab2[1][2] =15;
        tab2[2][1] =4;
        tab2[2][3] =12;
        tab2[3][2] =6;
        tab2[3][6] =13;
        wykonaj(tab2, 0, 1);


    }
}
