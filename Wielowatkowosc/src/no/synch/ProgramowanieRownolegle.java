package no.synch;

public class ProgramowanieRownolegle implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			// kod zadania do wykonania
			System.out.println("Wykonanie w pętli iteracji nr : " + i + "w wątku " + //
					Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
