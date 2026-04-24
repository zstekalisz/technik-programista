package pl.zste;

import java.io.InputStream;
import java.util.Scanner;

public class Zad2_1 {
    public static void main(String[] args) {
        InputStream stream = Zad2_1.class.getClassLoader().getResourceAsStream("symbole.txt");
        Scanner scanner = new Scanner(stream);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            boolean palindrome = palindrome(line);
            if (palindrome) {
                System.out.println(line);
            }

        }
    }

    public static boolean palindrome(String line) {
        String[] split = line.split("");
        int back = 11;
        boolean palindrome = true;
        for (int i = 0; i < split.length/2; i++) {
            if(split[i].equals(split[back])) {
                back--;
            }else{
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
