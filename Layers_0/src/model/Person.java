package model;

import java.io.Serializable;

public class Person implements Serializable, Comparable<Person>{
	private String name;
	private String id;
	private int age;
	private boolean sex;//true for female
		
	public Person(String name, String id, int age, boolean sex) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	@Override
	public int compareTo(Person other) {
		
		return Long.compare(Long.parseLong(this.getId()), Long.parseLong(other.getId()));
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
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
		
		return this.id.equalsIgnoreCase(other.getId());
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age
				+ ", sex=" + sex + "]";
	}	
}
