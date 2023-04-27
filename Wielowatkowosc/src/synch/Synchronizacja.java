package synch;

public class Synchronizacja {

	public static void main(String[] args) {
		Zasob z = new Zasob();
		WywolajZasob wz1 = new WywolajZasob(z, "brak");
		WywolajZasob wz2 = new WywolajZasob(z, "synchronizacji");
		WywolajZasob wz3 = new WywolajZasob(z, "czy napewno?");

	}

}
