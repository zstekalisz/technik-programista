package pl.zste.egzamin;

public class Pralka extends Urzadzenie{
	private int nrProgramuPrania = 0;

	public int setNrProgramuPrania(int program) {
		if(program>=1 && program<=12) {
			this.nrProgramuPrania = program;	
		}else {
			this.nrProgramuPrania = 0;
		}
		return this.nrProgramuPrania;	
	}
	
	

}
