package upeu.edu.pe.trabajo01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.trabajo01.dao.General;
import upeu.edu.pe.trabajo01.daolmpl.CustomersDaoIMpl;
import upeu.edu.pe.trabajo01.entity.Customers;

@Service

public class CustomersService implements General<Customers>{

	
	@Autowired
	private CustomersDaoIMpl daoIMpl;

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
		return daoIMpl.readAll();
	}
}
