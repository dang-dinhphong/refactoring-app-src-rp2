package jp.co.sss.crud.service;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;
import jp.co.sss.crud.io.EmployeeEmpIdReader;
import jp.co.sss.crud.io.IConsoleReader;
import jp.co.sss.crud.util.ConstantMsg;
import jp.co.sss.crud.util.ConstantValue;

public class EmployeeDeleteService implements IEmployeeService {

	@Override
	public void execute() throws SystemErrorException, IllegalInputException {
		// TODO 自動生成されたメソッド・スタブ
		IConsoleReader reader = new EmployeeEmpIdReader();
		EmployeeDAO employeeDAO = new EmployeeDAO();

		System.out.println(ConstantMsg.DELETE_INPUT_EMP_ID);
		int empId = (int) reader.input();
		Integer isSuccess = employeeDAO.delete(empId);
		if (isSuccess == ConstantValue.FAILED) {
			ConsoleWriter.showDeleteFail();
		} else {
			ConsoleWriter.showDeleteComplete();
		}
	}

}
