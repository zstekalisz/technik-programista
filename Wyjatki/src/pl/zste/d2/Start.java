package pl.zste.d2;

public class Start {

	public static void main(String[] args) {
		Exception exception = new Exception("Zgłaszam wyjątek bez powodu");
		try{
			//throw exception;
		}catch(Exception e) {
			System.out.println("wyłapałem wyjątek zgłoszony z powodu : "+e.getMessage());
		}finally {
			System.out.println("Wykonam się zawsze");
		}
		RuntimeException runtimeException = new RuntimeException("Zgłaszam wyjątek bez powodu");
		
		throw runtimeException;
	}

}
