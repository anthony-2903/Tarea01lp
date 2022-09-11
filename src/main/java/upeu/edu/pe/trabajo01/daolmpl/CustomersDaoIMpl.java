package upeu.edu.pe.trabajo01.daolmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.trabajo01.dao.General;
import upeu.edu.pe.trabajo01.entity.Customers;
@Component

public class CustomersDaoIMpl implements General<Customers>{

	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Customers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Customers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customers read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customers> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from customers", new BeanPropertyRowMapper<Customers>(Customers.class));
	}
	
}
