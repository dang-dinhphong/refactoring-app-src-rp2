package jp.co.sss.crud.service;

import java.util.List;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;
import jp.co.sss.crud.io.EmployeeDeptIdReader;
import jp.co.sss.crud.io.IConsoleReader;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * 部署（ID）検索サービスクラス
 */
public class EmployeeFindByDeptIdService implements IEmployeeService {

	@Override
	public void execute() throws SystemErrorException, IllegalInputException {
		IConsoleReader reader = new EmployeeDeptIdReader();
		EmployeeDAO employeeDAO = new EmployeeDAO();
		System.out.println(ConstantMsg.FIND_BY_DEPT_ID);
		int deptId = (int) reader.input();
		List<Employee> employeesDeptList = employeeDAO.findByDeptId(deptId);
		ConsoleWriter.showEmployeesList(employeesDeptList);
	}

}
