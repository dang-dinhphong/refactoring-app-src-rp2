package jp.co.sss.crud.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import jp.co.sss.crud.dto.Department;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.SystemErrorException;

public class EmployeeUtils {

	/**
	 * インスタンス化禁止
	 */
	private EmployeeUtils() {

	}

	public static List<Employee> resultSetToEmployee(ResultSet resultSet) throws SystemErrorException {
		try {
			if (resultSet == null || !resultSet.isBeforeFirst()) {
				List<Employee> emptiedEmployee = new ArrayList<>();
				return emptiedEmployee;
			}

			List<Employee> employees = new ArrayList<>();
			while (resultSet.next()) {
				Employee employee = new Employee();
				Department department = new Department();

				employee.setEmpId(resultSet.getInt(ConstantSQL.RECORD_EMP_ID));
				employee.setEmpName(resultSet.getString(ConstantSQL.RECORD_EMP_NAME));
				department.setDeptName(resultSet.getString(ConstantSQL.RECORD_DEPT_NAME));
				employee.setBirthday(resultSet.getString(ConstantSQL.RECORD_BIRTHDAY));
				employee.setGender(resultSet.getInt(ConstantSQL.RECORD_GENDER));
				employee.setDepartment(department);

				employees.add(employee);
			}
			return employees;

		} catch (SQLException e) {
			throw new SystemErrorException(ConstantMsg.MSG_SYS_ERROR, e);
		}
	}

	public static Employee setDTO(String empName, int gender, String birthday, int deptId) {
		Employee employee = new Employee();
		Department department = new Department();
		employee.setEmpName(empName);
		employee.setGender(gender);
		employee.setBirthday(birthday);
		department.setDeptId(deptId);
		employee.setDepartment(department);

		return employee;
	}

	public static Employee setDTO(int empId, String empName, int gender, String birthday, int deptId) {
		Employee employee = new Employee();
		Department department = new Department();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setGender(gender);
		employee.setBirthday(birthday);
		department.setDeptId(deptId);
		employee.setDepartment(department);

		return employee;
	}

	public static void bindPreparedStatement(PreparedStatement preparedStatement, Employee employee)
			throws SystemErrorException {
		if (preparedStatement == null || employee == null) {
			return;
		}
		try {
			preparedStatement.setString(ConstantValue.RESULT_NO_ONE, employee.getEmpName());
			preparedStatement.setInt(ConstantValue.RESULT_NO_TWO, employee.getGender());
			SimpleDateFormat sdf = new SimpleDateFormat(ConstantMsg.REGEX_DATE);
			preparedStatement.setObject(ConstantValue.RESULT_NO_THREE, sdf.parse(employee.getBirthday()), Types.DATE);
			preparedStatement.setInt(ConstantValue.RESULT_NO_FOUR, employee.getDepartment().getDeptId());

			if (employee.getEmpId() != null) {
				preparedStatement.setInt(ConstantValue.RESULT_NO_FIVE, employee.getEmpId());
			}
		} catch (SQLException | ParseException e) {
			throw new SystemErrorException(ConstantMsg.MSG_SYS_ERROR, e);
		}
	}
}
