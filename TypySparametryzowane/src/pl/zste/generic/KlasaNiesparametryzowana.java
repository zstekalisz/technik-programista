package pl.zste.generic;

public class KlasaNiesparametryzowana {
	
	private Object typ;

	public KlasaNiesparametryzowana(Object typ) {
		this.typ = typ;
	}
	public Object getTyp() {
		return typ;
	}
	public void wypiszTyp() {
		System.out.println(typ.getClass().getName());
	}

}
