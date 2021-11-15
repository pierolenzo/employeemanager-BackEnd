package it.pierolenzo.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import it.pierolenzo.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	
}
