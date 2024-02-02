package pl.zste.zadanieegzamin.arkusz6;

public class SitoErastostensa {

	public static void main(String[] args) {
		boolean[] tab = new boolean[200];
		setData(tab);
		markData(tab);
		displayData(tab);
	}
	
	public static void setData(boolean[] tab) {
		for(int i = 0; i<tab.length; i++) {
			tab[i] = true;
		}
	}
	
	public static void displayData(boolean[] tab) {
		for(int i = 0; i<tab.length; i++) {
			if(tab[i]) {
				System.out.println(i+" jest liczbą pierwszą.");
			}
		}
	}
	public static void markData(boolean[] tab) {
		double sqrt = Math.sqrt(tab.length);
		int rounded = (int) sqrt;
		for(int i = 2; i < rounded; i++) {
			for(int j = 2; j < tab.length; j++) {
				if(j>i && j%i==0) {
					tab[j] = false;
				}
				
			}
		}
	}

}
