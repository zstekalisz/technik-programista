package pl.kalisz.zste.konsola;

import java.util.Objects;

public class Record {
	
	private String artist;
	private String album;
	private int songsNumber;
	private int year;
	private int downloadNumber;
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getSongsNumber() {
		return songsNumber;
	}
	public void setSongsNumber(int songsNumber) {
		this.songsNumber = songsNumber;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDownloadNumber() {
		return downloadNumber;
	}
	public void setDownloadNumber(int downloadNumber) {
		this.downloadNumber = downloadNumber;
	}
	@Override
	public String toString() {
		return artist + "\n" + album + "\n" + songsNumber + "\n" + year
				+ "\n" + downloadNumber + "\n\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(album, artist, downloadNumber, songsNumber, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Record other = (Record) obj;
		return Objects.equals(album, other.album) && Objects.equals(artist, other.artist)
				&& downloadNumber == other.downloadNumber && songsNumber == other.songsNumber && year == other.year;
	}
	
	
	

}
