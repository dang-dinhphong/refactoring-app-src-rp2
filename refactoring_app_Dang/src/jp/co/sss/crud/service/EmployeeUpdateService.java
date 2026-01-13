package jp.co.sss.crud.service;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;
import jp.co.sss.crud.io.EmployeeBirthdayReader;
import jp.co.sss.crud.io.EmployeeDeptIdReader;
import jp.co.sss.crud.io.EmployeeEmpIdReader;
import jp.co.sss.crud.io.EmployeeEmpNameReader;
import jp.co.sss.crud.io.EmployeeGenderReader;
import jp.co.sss.crud.io.IConsoleReader;
import jp.co.sss.crud.util.ConstantMsg;
import jp.co.sss.crud.util.ConstantValue;
import jp.co.sss.crud.util.EmployeeUtils;

public class EmployeeUpdateService implements IEmployeeService {

	@Override
	public void execute() throws SystemErrorException, IllegalInputException {
		// TODO 自動生成されたメソッド・スタブ
		IConsoleReader reader = new EmployeeEmpIdReader();
		EmployeeDAO employeeDAO = new EmployeeDAO();

		System.out.println(ConstantMsg.UPDATE_INPUT_EMP_ID);
		int empId = (int) reader.input();

		Employee employee = convertDTO(empId);
		Integer isSuccess = employeeDAO.update(employee);

		if (isSuccess == ConstantValue.FAILED) {
			ConsoleWriter.showUpdateFail();
		} else {
			ConsoleWriter.showUpdateComplete();
		}
	}

	public Employee convertDTO(int empId) throws SystemErrorException, IllegalInputException {
		IConsoleReader reader = new EmployeeEmpNameReader();

		System.out.println(ConstantMsg.INPUT_EMP_NAME);
		String empName = (String) reader.input();

		System.out.println(ConstantMsg.INPUT_GENDER);
		reader = new EmployeeGenderReader();
		int gender = (int) reader.input();

		System.out.println(ConstantMsg.INPUT_BIRTHDAY);
		reader = new EmployeeBirthdayReader();
		String birthday = (String) reader.input();

		System.out.println(ConstantMsg.INPUT_DEPT_ID);
		reader = new EmployeeDeptIdReader();
		int deptId = (int) reader.input();

		Employee employeeUpdate = EmployeeUtils.setDTO(empId, empName, gender, birthday, deptId);
		return employeeUpdate;

	}

}
