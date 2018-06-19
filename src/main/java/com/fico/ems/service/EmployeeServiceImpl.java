package com.fico.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fico.ems.dao.EMSDao;
import com.fico.ems.model.Employee;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EMSDao emsDao;
	@Override
	public List<Employee> getAllEmployee() {
		
		return (List<Employee>) emsDao.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		emsDao.save(employee);

	}

	@Override
	public Employee findEmployeeByEmail(String officeEmail) {
		// TODO Auto-generated method stub
		return emsDao.findByEmail(officeEmail);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		emsDao.delete(employee);
		
	}

}
