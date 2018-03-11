package co.edu.unal;


import java.io.Serializable;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Load;

@Entity
public class Book implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id private Long id;
	private String name;
	private String isbn;
	private String author;
	private String topic;
	private String editorial;
	private int pages;
	private double price;
	private double reputation;
	private boolean exchange;
	private boolean forSale;
	private int copies;
	private int state; // 1- 10
	private @Load Ref<Person> person;
	
	public Book(){};
	
	public Book(String name, String author, String topic, int pages, double price) {
		this.name = name;
		this.author = author;
		this.topic = topic;
		this.pages = pages;
		this.price = price;
	}
	
	public Book(Long id, String name, String isbn, String author, String topic, String editorial, int pages,
			double price, double reputation, boolean exchange, boolean forSale, int copies, int state) {
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.author = author;
		this.topic = topic;
		this.editorial = editorial;
		this.pages = pages;
		this.price = price;
		this.reputation = reputation;
		this.exchange = exchange;
		this.forSale = forSale;
		this.copies = copies;
		this.state = state;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getReputation() {
		return reputation;
	}
	
	public void setReputation(double reputation) {
		this.reputation = reputation;
	}
	
	public boolean isExchange() {
		return exchange;
	}
	
	public void setExchange(boolean exchange) {
		this.exchange = exchange;
	}
	
	public boolean isForSale() {
		return forSale;
	}
	
	public void setForSale(boolean forSale) {
		this.forSale = forSale;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}

	public Ref<Person> getPerson() {
		return person;
	}

	public void setPerson(Ref<Person> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", topic=" + topic + ", pages=" + pages + ", price="
				+ price + "]";
	}
	
}
