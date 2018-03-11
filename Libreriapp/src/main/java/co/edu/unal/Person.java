package co.edu.unal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Load;

@Entity
public class Person implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id private String email;
	private String password;
	private String name;
	private String lastName;
	private Date birthday;
	private byte[] picture;
	private double reputation;
	private int points;
	private @Load List<Ref<Book>> myBooks;
	
	public Person() {
		myBooks = new ArrayList<Ref<Book>>();
	}
	
	public Person(String email, String password, String name, String lastName) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
		myBooks = new ArrayList<Ref<Book>>();
	}

	public Person(String email, String password, String name, String lastName, Date birthday, byte[] picture,
			double reputation, int points, List<Ref<Book>> myBooks) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
		this.birthday = birthday;
		this.picture = picture;
		this.reputation = reputation;
		this.points = points;
		this.myBooks = myBooks;
	}
	
	public void showMyBooks()
	{
		for (int i = 0; i < myBooks.size(); i++) {
			System.out.println(myBooks.get(i).get());
		}
	}
	
	public void showMyReferenceBooks()
	{
		for (int i = 0; i < myBooks.size(); i++) {
			System.out.println(myBooks.get(i));
		}
	}
	
	public void addBook(Book b)
	{
		myBooks.add(Ref.create(b));
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public byte[] getPicture() {
		return picture;
	}
	
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
	public double getReputation() {
		return reputation;
	}
	
	public void setReputation(double reputation) {
		this.reputation = reputation;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}

	public List<Ref<Book>> getMyBooks() {
		return myBooks;
	}

	public void setMyBooks(List<Ref<Book>> myBooks) {
		this.myBooks = myBooks;
	}

	@Override
	public String toString() {
		return "Person [email=" + email + ", password=" + password + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
}
