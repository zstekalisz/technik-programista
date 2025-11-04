package pl.zste.kalisz.egzamin.konsola;

public class Pralka extends Urzadzenie {
	
	private int numerProgramuPrania = 0;
	
	/**
	 * nazwa: setnumerProgramu
	 * opis: metoda ustawia numer programu pralki od 1 do 12
	 * parametry : @param numerProgramu - typ int
	 * @return - metoda zwraca numer programu pralki od 1 do 12 lub 0 w przypadku gdy nie udało się ustawić numer programu
	 * autor : @author Radek
	 */
	public int setNumerProgramu(int numerProgramu) {
		// sprawdzam czy numer programu jes z zakresi 1 do 12
		if(numerProgramu>=1 && numerProgramu<=12) {
			this.numerProgramuPrania = numerProgramu;
		}else {
			this.numerProgramuPrania = 0;
		}
		return this.numerProgramuPrania;
	}

}
