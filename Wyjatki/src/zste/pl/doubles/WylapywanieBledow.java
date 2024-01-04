package zste.pl.doubles;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import zste.pl.wyjatki.MojWyjatek;

public class WylapywanieBledow {

	public static void main(String[] args) {
		String s = null;
		try {
			Double.parseDouble(s);
			Double.parseDouble("nie liczba");
		} catch (NullPointerException ex) {
			System.out.println("parametr jest nullem");
		} catch (NumberFormatException ex) {
			System.out.println("wyj¹tek zwróci³ informacjê o b³êdzie dla parametru " + ex.getMessage());
		} catch (Throwable ex) {

		}
		Double.parseDouble("23.23");
	}

	public static void konwersja(String parametr) throws MojWyjatek {
		try {
			Double.parseDouble(parametr);
		} catch (NumberFormatException ex) {
			MojWyjatek wyjatek = new MojWyjatek("B³ad", ex);
			throw wyjatek;
		}
	}

}
