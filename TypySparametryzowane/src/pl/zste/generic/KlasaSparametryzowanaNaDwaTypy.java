package pl.zste.generic;

public class KlasaSparametryzowanaNaDwaTypy <T,V>{
	
	private T typA;
	private V typB;
	
	public KlasaSparametryzowanaNaDwaTypy(T typA, V typB) {
		this.typA = typA;
		this.typB = typB;
	}
	
	public T getTypA() {
		return typA;
	}
	public V getTypB() {
		return typB;
	}
	
	public void pokazTypy() {
		String name = typA.getClass().getName();
		String name2 = typB.getClass().getName();
		System.out.println("typy w tej klasie to : " + name+" i "+name2);
	}

}
