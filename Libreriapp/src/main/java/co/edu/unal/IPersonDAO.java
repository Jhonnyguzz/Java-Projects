package co.edu.unal;

import java.util.List;

public interface IPersonDAO {

	void save(Person p);

	Person load(String email);

	void remove(Person p);

	void remove(String email);

	List<Person> getAll();

}