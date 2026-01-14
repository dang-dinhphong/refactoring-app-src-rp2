package jp.co.sss.crud.io;

import java.util.List;

import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * コンソール出力専用クラス
 */
public class ConsoleWriter {

	/**
	 * インスタンス化禁止
	 */
	private ConsoleWriter() {

	}

	/**
	 * 社員情報管理システムのメニュ表示
	 */
	public static void showMenu() {
		System.out.println(ConstantMsg.MSG_MENU_SYSTEM_NAME);
		System.out.println(ConstantMsg.MSG_MENU_FIND_ALL);
		System.out.println(ConstantMsg.MSG_MENU_FIND_BY_EMP_NAME);
		System.out.println(ConstantMsg.MSG_MENU_FIND_BY_DEPT_ID);
		System.out.println(ConstantMsg.MSG_MENU_CREATE);
		System.out.println(ConstantMsg.MSG_MENU_UPDATE);
		System.out.println(ConstantMsg.MSG_MENU_DELETE);
		System.out.println(ConstantMsg.MSG_MENU_SHUT_DOWN);
		System.out.print(ConstantMsg.MSG_CHOOSE_MENU_NO);
	}

	/**
	 * 社員情報管理システムの終了
	 */
	public static void showShutDown() {
		System.out.println(ConstantMsg.MSG_SHUT_DOWN);
	}

	/**
	 * 検索レコードのヘッド
	 */
	public static void showHeader() {
		System.out.println(ConstantMsg.MSG_RESULT_HEADER);
	}

	/**
	 * 検索レコードの表示用
	 * 
	 * @param employees 社員レコード
	 */
	public static void showEmployeesList(List<Employee> employees) {
		if (!employees.isEmpty()) {
			ConsoleWriter.showHeader();
			employees.forEach(System.out::print);
			System.out.println();
		} else {
			ConsoleWriter.showInvalid();
		}
	}

	/**
	 * 社員レコード数が0である場合の表示
	 */
	public static void showInvalid() {
		System.out.println(ConstantMsg.MSG_INVALID_EMPLOYEE);
	}

	/**
	 * 社員情報を1件登録成功時の表示
	 */
	public static void showCreateComplete() {
		System.out.println(ConstantMsg.MSG_CREATE_COMPLETE);
	}

	/**
	 * 社員情報を1件更新成功時の表示
	 */
	public static void showUpdateComplete() {
		System.out.println(ConstantMsg.MSG_UPDATE_COMPLETE);
	}

	/**
	 * 社員情報を1件削除成功時の表示
	 */
	public static void showDeleteComplete() {
		System.out.println(ConstantMsg.MSG_DELETE_COMPLETE);
	}

	/**
	 * 社員情報を1件更新失敗時の表示
	 */
	public static void showUpdateFail() {
		System.out.println(ConstantMsg.MSG_UPDATE_ERROR);
	}

	/**
	 * 社員情報を1件削除失敗時の表示
	 */
	public static void showDeleteFail() {
		System.out.println(ConstantMsg.MSG_DELETE_ERROR);
	}

}
