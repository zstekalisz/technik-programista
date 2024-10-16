package pl.zste.konsola;

import java.util.Objects;

public class MusicRecord {
	
	private String artist;
	private String album;
	private int songsNumber;
	private int year;
	private long downloadNumber;
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
	public long getDownloadNumber() {
		return downloadNumber;
	}
	public void setDownloadNumber(long downloadNumber) {
		this.downloadNumber = downloadNumber;
	}
	@Override
	public String toString() {
		return artist + "\n" + album+ "\n"+ songsNumber + "\n" + year + "\n" + downloadNumber + "\n\n";
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
		MusicRecord other = (MusicRecord) obj;
		return Objects.equals(album, other.album) && Objects.equals(artist, other.artist)
				&& downloadNumber == other.downloadNumber && songsNumber == other.songsNumber && year == other.year;
	}

	
	
	
	
	

}
