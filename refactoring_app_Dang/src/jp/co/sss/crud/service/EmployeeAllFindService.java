package jp.co.sss.crud.service;

import java.util.List;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;

/**
 * 全件検索サービスクラス
 */
public class EmployeeAllFindService implements IEmployeeService {

	@Override
	public void execute() throws SystemErrorException, IllegalInputException {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> employeesList = employeeDAO.findAll();
		ConsoleWriter.showEmployeesList(employeesList);
	}

}
