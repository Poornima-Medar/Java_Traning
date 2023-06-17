package encora.employee.app.service;

import encora.employee.app.dto.EmployeeDto;

public interface EmployeeService {
	 
	public void saveEmployee(EmployeeDto employeeDto);
	
	public void searchEmployee(EmployeeDto employeeDto);
	
	public void updateEmployee(EmployeeDto employeeDto);
	
	public void deleteEmployee(EmployeeDto employeeDto);
	
	
	
	
	

}
