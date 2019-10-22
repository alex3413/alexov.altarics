package ru.alexov.altarics.DAO;

import ru.alexov.altarics.entity.Employee;

public interface EmployeeDao {
	Employee read(int id);
	Employee create();
	

}
