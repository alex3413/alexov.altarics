package ru.alexov.altarics.entity;

import java.time.LocalDate;
enum POSITION {manager, bookkiper}

public class Employee {
	private String name;
	private String surname;
	String otchestvo=null;
	char sex;
	LocalDate datOfbirthday;
	int contactTel;
	String email;
	LocalDate dataofgoemploy;
	LocalDate dataofgetout=null;
	boolean bossofdepartment;
	POSITION position;
	double salary;
	Department department;
	int id;
	
	
}
