package zste.pl.wyjatki;

public class MojWyjatek extends Exception {
	
	public MojWyjatek(String message, Exception ex) {
		super(message, ex);
	}

	private static final long serialVersionUID = 34065730955220404L;

}
