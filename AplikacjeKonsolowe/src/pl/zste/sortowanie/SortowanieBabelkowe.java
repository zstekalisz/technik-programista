package pl.zste.sortowanie;

public class SortowanieBabelkowe {
	
	public static void sort(int[] tab) {
		for(int i = 0; i <tab.length; i++) {
			for(int j = 0; j <tab.length-1; j++) {
				if(tab[j]>tab[j+1]) {
					int buff = tab[j];
					tab[j] = tab[j+1];
					tab[j+1]= buff;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] tablica = new int[100];
		for(int i =0; i<100; i++) {
			tablica[i]=(int)(Math.random()*10000);
		}
		sort(tablica);
		for(int i =0; i<100; i++) {
			 System.out.println(tablica[i]);
		}
	}

}
