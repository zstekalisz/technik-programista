package pl.zste.zadanieegzamin.arkusz2;

import java.util.Scanner;

public class EuklidesTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("Podaj pierwsz¹ liczbê : ");
			String value = sc.nextLine();
			if(value.equals("exit"))break;
			int a;
			int b;
			try {
			a = Integer.parseInt(value);
			}catch(NumberFormatException ex) {
				System.out.println("Nie wpisa³eœ poprawnie liczby");
				continue;
			}
			System.out.println("Podaj drug¹ liczbê: ");
			String value2 = sc.nextLine();
			
			try {
				b = Integer.parseInt(value2);
				}catch(NumberFormatException ex) {
					System.out.println("Nie wpisa³eœ poprawnie liczby");
					continue;
				}
			int result=EuklidesNWD.obliczNWD(a, b);
			System.out.println("Najwiêkszy wspólny dzielnik dla liczb :"+a+", "+b+" wynosi "+result);
			
		}
		
		
		sc.close();
	}

}
