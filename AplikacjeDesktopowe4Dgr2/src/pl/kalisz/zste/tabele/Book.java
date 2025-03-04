package pl.kalisz.zste.tabele;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Book {
	String title;
	String author;
	String publisher;
	String category;
	
	public Book(String title, String author, String publisher, String category) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Vector<String> createRowForTable() {
		Vector<String> row = new Vector<>();
		row.add(title);
		row.add(author);
		row.add(publisher);
		row.add(category);
		return row;
	}
	
	public static List<Book> getBooksSample(){
		List<Book> list = new ArrayList<>();
		list.add(new Book("Ferdydurke", "Witold Gąbrowicz", "Wydawnictwo literackie", "Lektura"));
		list.add(new Book("Angular dla profesionalistów", "Adam Freeman", "Helion", "Literatura techniczna"));
		list.add(new Book("Potop", "Henryk Sienkiewicz", "Wydawnictwo literackie", "Powieść"));
		list.add(new Book("Opowiadania Borowskiego", "Tadeusz Borowski", "Wydawnictwo Aleksandria", "Opowiadania"));
		list.add(new Book("Rozmowy z katem", "Kazimierz Moczarski", "Wydawnictwo literackie", "Historyczna"));
		list.add(new Book("Wiedźmin", "Andrzej Sapkowski", "Znak horyzont", "Powieść fantastyczna"));
		return list;
	}
	

}
