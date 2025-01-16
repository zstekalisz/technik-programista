package pl.zste.desktop.cwiczenia;

import java.io.InputStream;
import java.util.Scanner;

public class TestOdczytuZPliku {

	public static void main(String[] args) {
		TestOdczytuZPliku zPliku = new TestOdczytuZPliku();
		InputStream resourceAsStream = TestOdczytuZPliku.class.getClassLoader().getResourceAsStream("counter.txt");
		InputStream inputStream = zPliku.getClass().getClassLoader().getResourceAsStream("counter.txt");
		//System.out.println(inputStream);
		Scanner sc = new Scanner(inputStream);
		sc.useDelimiter(" ");
		String next = sc.next();
		System.out.println(next);
		String next1 = sc.next();
		System.out.println(next1);
		String next2 = sc.next();
		System.out.println(next2);
		sc.next();
	}

}
