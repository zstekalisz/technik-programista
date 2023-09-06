package pl.zste.d2;

public class PropagacjaWyjatku {
	
	public int dzielimy(int a, int b) throws Exception {
		if(b==0) {
			throw new Exception("Koleżko, nie dziel przez zero");
		}
		return a/b;
	}

}
