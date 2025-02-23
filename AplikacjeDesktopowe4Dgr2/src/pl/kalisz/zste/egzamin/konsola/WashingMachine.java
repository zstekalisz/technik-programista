package pl.kalisz.zste.egzamin.konsola;

public class WashingMachine extends Device {
	
	private int programOption = 0;

	public int setProgramOption(int programOption) {
		//sprawdzam czy parametr miesci się w zakresie od 1 do 12
		if(programOption>=1 && programOption<=12) {
			this.programOption = programOption;
		}else {
			this.programOption = 0;
		}
		return this.programOption;
		
	}
	

}
