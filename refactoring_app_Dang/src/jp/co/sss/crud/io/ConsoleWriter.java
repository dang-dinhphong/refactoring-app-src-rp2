package jp.co.sss.crud.io;

import java.util.List;

import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.util.ConstantMsg;

public class ConsoleWriter {
	private ConsoleWriter() {

	}

	public void showMenu() {
		System.out.println(ConstantMsg.MSG_MENU_NAME);
		System.out.println(ConstantMsg.MSG_MENU_FIND_ALL);
		System.out.println(ConstantMsg.MSG_MENU_FIND_DEPT);
		System.out.println(ConstantMsg.MSG_MENU_CREATE);
		System.out.println(ConstantMsg.MSG_MENU_UPDATE);
		System.out.println(ConstantMsg.MSG_MENU_DELETE);
		System.out.println(ConstantMsg.MSG_MENU_SHUT_DOWN);
		System.out.print(ConstantMsg.MSG_CHOOSE_MENU_NO);
	}

	public void showShutDown() {
		System.out.println(ConstantMsg.MSG_SHUT_DOWN);
	}

	public void showHeader() {
		System.out.println(ConstantMsg.MSG_RESULT_HEADER);
	}

	public void showEmployeesList(List<Employee> employees) {
		if (!employees.isEmpty()) {
			showHeader();
			//			employees.forEach(System.out.println::employees);
			//打鍵中
		} else {
			showInvalid();
		}
	}

	public void showInvalid() {
		System.out.println(ConstantMsg.MSG_INVALID_EMPLOYEE);
	}

	public void showCreateComplete() {
		System.out.println(ConstantMsg.MSG_CREATE_COMPLETE);
	}

	public void showDeleteComplete() {
		System.out.println(ConstantMsg.MSG_DELETE_COMPLETE);
	}
}
