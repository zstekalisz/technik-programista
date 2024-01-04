package no.synch;

public class BrakSynchronizacji {

	public static void main(String[] args) {
		WspolnyZasob wz = new WspolnyZasob();
		Wywolywacz w1 = new Wywolywacz(wz, "brak");
		Wywolywacz w2 = new Wywolywacz(wz, "jakiejkolwiek");
		Wywolywacz w3 = new Wywolywacz(wz, "synchronizacji");
		}

}
