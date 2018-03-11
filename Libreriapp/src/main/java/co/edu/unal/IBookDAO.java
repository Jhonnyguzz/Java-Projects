package co.edu.unal;

import java.util.List;

public interface IBookDAO {

	void save(Book b);

	Book load(Long id);

	void remove(Book b);

	void remove(Long id);

	List<Book> getAll();

}