package pl.zste.konsola;

import java.util.Arrays;

public class Osoba {
	
	private String imie;
	private String nazwisko;
	private Adres adres;
	private String nip;
	
	public Osoba(String imie, String nazwisko, Adres adres) {
		this.imie = imie == null ? "" : imie;
		this.nazwisko = nazwisko == null ? "" : nazwisko;
		this.adres = adres;
	}
	
	public String getImie() {
		if(imie==null)
			imie = "";
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
	
	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		if(nip.length()!=10) {
			this.nip = null;
			return;
		}
		String[] splited = nip.split("");	
		for(String s : splited) {
			try {
				Integer.parseInt(s);
			}catch (NumberFormatException e) {
				this.nip = null;
				return;
			}
			
		}
		this.nip = nip;
	}

	public String daneTeleadresowe() {
		StringBuilder builder = new StringBuilder();
		builder.append(getAdres().getKodPocztowy());
		builder.append(" ");
		if(getAdres().getPoczta()!=null) {
			builder.append(getAdres().getPoczta());
			builder.append(", ");
			builder.append(getAdres().getMiejscowosc());
			builder.append(" ");
		}else {
			builder.append(getAdres().getMiejscowosc());
			builder.append(", ");
		}
		if(getAdres().getUlica()!=null) {
			builder.append("ul.");
			builder.append(getAdres().getUlica());
			builder.append(" ");
		}
		builder.append(getAdres().getNrDomu());
		if(getAdres().getNrMieszkania()!=null) {
			builder.append("/");
			builder.append(getAdres().getNrMieszkania());
		}
		return builder.toString();
	}
	public String pelneDaneOsoby() {
		StringBuilder builder = new StringBuilder();
		builder.append(imie);
		builder.append(" ");
		builder.append(nazwisko);
		builder.append(" ");
		if(nip!=null) {
			builder.append("NIP: ");
			builder.append(nip.substring(0, 3));
			builder.append("-");
			builder.append(nip.substring(3, 6));
			builder.append("-");
			builder.append(nip.substring(6, 8));
			builder.append("-");
			builder.append(nip.substring(8));
			builder.append(" ");
		}
		builder.append(daneTeleadresowe());
		return builder.toString();
	} 

}
