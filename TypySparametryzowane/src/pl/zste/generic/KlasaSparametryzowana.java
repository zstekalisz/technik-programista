package pl.zste.generic;

public class KlasaSparametryzowana<T> {

	private T typ;

	public KlasaSparametryzowana(T typ) {
		this.typ = typ;
	}
	
	public T getTyp() {
		return typ;
	}
	public void wypiszTyp() {
		Class<? extends Object> classs = typ.getClass();
		String name = classs.getName();
		System.out.println(name);
	}
}
