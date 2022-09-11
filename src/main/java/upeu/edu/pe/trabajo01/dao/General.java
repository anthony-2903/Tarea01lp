package upeu.edu.pe.trabajo01.dao;

import java.util.List;

public interface General<T> {
	
	  int create (T t);
	  int update (T t);
	  int delete(int id);
	  T read(int id);
	  List<T> readAll();

}
