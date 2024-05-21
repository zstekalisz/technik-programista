package pl.zste.start;

import java.util.function.Consumer;

public class ImplementacjaKonsumeraDlaInt implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}

}
