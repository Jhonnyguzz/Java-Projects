package entities;

import java.io.Serializable;

public class Person implements Serializable, Comparable<Person>
{
	private String name;
	private Long id;
	
	public Person(String name, Long id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode() {
		
		return (int)id.longValue();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return this.id == other.id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public int compareTo(Person arg)
	{
		return Long.valueOf(this.id).compareTo(arg.id);
	}
}