package pl.zste;

import java.io.InputStream;
import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) {
        InputStream stream = Zad3_1.class.getClassLoader().getResourceAsStream("dron.txt");
        Scanner scanner = new Scanner(stream);
        int licznik = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            int v1 = Integer.parseInt(split[0]);
            int v2 = Integer.parseInt(split[1]);
            int nwd = nwd(v1, v2);
            if(nwd>1){
                licznik++;
            }
        }
        System.out.println(licznik);
    }

    public static int nwd(int a, int b){
        if(b<0){
            b = b * (-1);
        }
        if(b==0){
            return a;
        }
        if(a==0){
            return b;
        }
        while (a!=b){
            if(a>b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        return a;
    }
}
