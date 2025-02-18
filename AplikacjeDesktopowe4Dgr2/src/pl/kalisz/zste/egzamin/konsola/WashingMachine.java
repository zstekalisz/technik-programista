package pl.kalisz.zste.egzamin.konsola;

public class WashingMachine extends Device {
	
	private int programOption = 0;

	public int setProgramOption(int programOption) {
		if(programOption>=1 && programOption<=12) {
			this.programOption = programOption;
		}else {
			this.programOption = 0;
		}
		return this.programOption;
		
	}
	

}
