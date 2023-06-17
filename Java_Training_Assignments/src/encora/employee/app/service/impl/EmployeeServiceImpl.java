package encora.employee.app.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

import encora.employee.app.dto.EmployeeDto;
import encora.employee.app.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void saveEmployee(EmployeeDto employeeDto) {

		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3000/emp_db", "root", "root123");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO emp_db.employee_info\n"
					+ "(employee_id,employee_name, gender, pf, graduity, mealcard, nps, mediclaim, office_location, employee_address, employee_salary)\n"
					+ "VALUES(?,?,?,?,?, ?, ?, ?, ?, ?, ?);\n" + "");
			ps.setInt(1, employeeDto.getEmployeeID());
			ps.setString(2, employeeDto.getEmployeeName());
			ps.setString(3, employeeDto.getGender());
			ps.setBoolean(4, employeeDto.getPf());
			ps.setBoolean(5, employeeDto.getGraduity());
			ps.setBoolean(6, employeeDto.getMealCard());
			ps.setBoolean(7, employeeDto.getNps());
			ps.setBoolean(8, employeeDto.getMediclaim());
			ps.setString(9, employeeDto.getOfficeLocation());
			ps.setString(10, employeeDto.getEmployeeAddress());
			ps.setInt(11, employeeDto.getEmployeeSalary());
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateEmployee(EmployeeDto employeeDto) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3000/emp_db", "root", "root123");
			PreparedStatement ps = conn.prepareStatement("UPDATE emp_db.employee_info\n"
					+ "SET employee_name=?, gender=?, pf=?, graduity=?, mealcard=?, nps=?, mediclaim=?, office_location=?, employee_address=?, employee_salary=? \n"
					+ "WHERE employee_id=?;");
			ps.setString(1, employeeDto.getEmployeeName());
			ps.setString(2, employeeDto.getGender());
			ps.setBoolean(3, employeeDto.getPf());
			ps.setBoolean(4, employeeDto.getGraduity());
			ps.setBoolean(5, employeeDto.getMealCard());
			ps.setBoolean(6, employeeDto.getNps());
			ps.setBoolean(7, employeeDto.getMediclaim());
			ps.setString(8, employeeDto.getOfficeLocation());
			ps.setString(9, employeeDto.getEmployeeAddress());
			ps.setInt(10, employeeDto.getEmployeeSalary());
			ps.setInt(11, employeeDto.getEmployeeID());
			ps.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEmployee(EmployeeDto employeeDto) {
		
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3000/emp_db", "root", "root123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void searchEmployee(EmployeeDto employeeDto) {
		EmployeeDto dto = new EmployeeDto();
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3000/emp_db", "root", "root123");
			PreparedStatement ps = conn.prepareStatement("SELECT employee_id, employee_name, gender, pf, graduity, mealcard, nps, mediclaim, office_location, employee_address, employee_salary\n"
					+ "FROM emp_db.employee_info;\n"
					+ "WHERE employee_id=?");
			ps.setInt(1, employeeDto.getEmployeeID());
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				dto.setEmployeeID(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
