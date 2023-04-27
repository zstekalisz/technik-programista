package no.synch;

public class ProgramowanieRownolegleDrugiSposob extends Thread {
	
	public ProgramowanieRownolegleDrugiSposob(String name) {
		super(name);
	}

	@Override
	public void run() {
		int index = 0;
		while (index<10) {
			System.out.println("Wykonanie pętli while po raz : "+index+ " w wątku " +this.getName());
			index++;
			if(index==5) {
				index = index/0;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
