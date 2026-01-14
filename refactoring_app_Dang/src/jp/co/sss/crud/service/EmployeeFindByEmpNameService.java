package jp.co.sss.crud.service;

import java.util.List;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;
import jp.co.sss.crud.io.EmployeeEmpNameReader;
import jp.co.sss.crud.io.IConsoleReader;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * 社員名検索サービスクラス
 */
public class EmployeeFindByEmpNameService implements IEmployeeService {

	@Override
	public void execute() throws SystemErrorException, IllegalInputException {
		// TODO 自動生成されたメソッド・スタブ
		IConsoleReader reader = new EmployeeEmpNameReader();
		EmployeeDAO employeeDAO = new EmployeeDAO();
		System.out.println(ConstantMsg.INPUT_EMP_NAME);
		String empName = (String) reader.input();
		List<Employee> employeesNameList = employeeDAO.findByEmployeeName(empName);
		ConsoleWriter.showEmployeesList(employeesNameList);
	}

}
