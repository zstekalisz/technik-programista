package pl.zste.zadanieegzamin.arkusz2;

public class EuklidesNWD {
	
	public static int obliczNWD(int a, int b) {
		if(a!=b) {
			//tak
			if(a>b) {
				//tak
				a= a-b;
			}else {
				//nie
				b=b-a;
			}
		}else {
			//nie
			return a;
		}
	}

}
