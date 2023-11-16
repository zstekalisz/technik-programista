package pl.zste.zadanieegzamin.arkusz3;

public class SortowanieMalejace {
	
	private int[] tablica = new int[10];

	public static void main(String[] args) {
		

	}
	public void sortMyTable() {
		for(int i =0; i<tablica.length;i++) {
			int indexOfMax = getIndexOfMax(tablica, i);
			tablica[indexOfMax]= tablica[i];
			tablica[i] = tablica[indexOfMax];
		}
	}
	public int getIndexOfMax(int[] tab, int tabStartIndex) {
		int result = tab[tabStartIndex];
		int resultIndex = tabStartIndex;
		for(int i = tabStartIndex; i<tab.length;i++) {
			int buf = tab[i];
			if(buf>result) {
				result=buf;
				resultIndex = i;
			}
	
		}
		return resultIndex;
	}

}
