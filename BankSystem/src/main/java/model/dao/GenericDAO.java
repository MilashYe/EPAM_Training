package model.dao;

import java.util.List;

public interface GenericDAO<T> {

	void create(T entity);

	T readById(long id);

	T readByString(String str);

	List<T> readAll();

	void update(T entity);

	void delete(T entity);

	void close();

}
