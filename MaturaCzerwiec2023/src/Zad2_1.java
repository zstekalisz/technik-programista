public class Zad2_1 {

    public static boolean czyMniejszy(String slowo, int k1, int k2){
        int i = k1-1;
        int j = k2-1;
        int n = slowo.length()-1;
        String[] s = slowo.split("");
        while (i<=n && j<=n){
            if(s[i].charAt(0)==s[j].charAt(0)){
                i++;
                j++;
            }else{
                return s[i].charAt(0) < s[j].charAt(0);
            }
        }
        return j <= n;
    }

    public static void main(String[] args) {
        czyMniejszy("kakakakbwa", 1, 3);
    }
}
