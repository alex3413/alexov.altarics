package ru.alexov.altarics.DAO;

import ru.alexov.altarics.entity.Department;

public interface DepartmentDao {
	Department createdep();
	boolean renamedep();
	boolean deletedep();
	Department read(int Id);
	Department update(Department dep);
	

}
