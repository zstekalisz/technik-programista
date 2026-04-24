import java.util.Arrays;

public class Zad2_3 {
    public static void main(String[] args) {
        int[] mascarpones = dajTablice("mascarpone");
        for (int i : mascarpones){
            System.out.println(i);
        }
    }

    public static int[] dajTablice(String slowo){
        int[] result = new int[slowo.length()];
        for (int i = 0; i<slowo.length();i++){
            result[i] = i+1;
        }
        for (int i = 0; i<slowo.length();i++){
            int index = 0;
            for (int j = 0; j<slowo.length();j++){
                if(i==j) continue;
                if(!Zad2_1.czyMniejszy(slowo, i+1, j+1)){
                    index++;
                }
            }
            result[index] = i+1;
        }
        return result;
    }
}
