package pl.zste.testy.egzamin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class TestyEgzamin {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbę losowań");
		int liczbaLosowan = scanner.nextInt();
		HashMap<Integer, Set<Integer>> hashMap = new HashMap<>();
		for(int i = 1; i<=liczbaLosowan; i++) {
			Set<Integer> zestaw = losujZestaw();
			hashMap.put(i, zestaw);
		}
		Set<Entry<Integer, Set<Integer>>> entrySet = hashMap.entrySet();
		entrySet.forEach(entry->{
			System.out.print("Losowanie numer "+ entry.getKey()+": ");
			entry.getValue().forEach(liczba->{
				System.out.print(liczba+" ");
			});
			System.out.print("\n");
		});
		for(int i = 1; i<=49; i++) {
			int counter = 0;
			Set<Entry<Integer, Set<Integer>>> zbiory = hashMap.entrySet();
			for(Entry<Integer, Set<Integer>> entry:zbiory) {
				Set<Integer> value = entry.getValue();
				for(Integer liczba : value) {
					if(liczba == i) {
						counter++;
					}
				}
			}
			System.out.println("Liczba "+i+ " została wylosowana "+counter+ " razy");
		}
	}
	
	private static Set<Integer> losujZestaw(){
		Set<Integer> hashSet = new HashSet<>();
		Random random = new Random();
		while(hashSet.size()<6) {
			int wylosowana = random.nextInt(49);
			wylosowana++;
			hashSet.add(wylosowana);
		}
		return hashSet;
		
	}

}
