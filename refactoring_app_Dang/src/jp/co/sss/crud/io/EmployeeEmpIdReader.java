package jp.co.sss.crud.io;

import jp.co.sss.crud.util.ConstantMsg;

/**
 * 社員IDの入力バリデーションチェッククラス
 */
public class EmployeeEmpIdReader implements IConsoleReader {

	/**
	 * バリデーションチェック時のエラーメッセージ表示
	 */
	@Override
	public String getErrorMsg() {
		return ConstantMsg.VALID_EMP_ID;
	}

	/**
	 * 入力した文字列の値が適正かどうかによる実行処理
	 */
	@Override
	public boolean isValid(String inputString) {
		return inputString.matches(ConstantMsg.REGEX_EMP_ID);
	}

	@Override
	public boolean isParseInt() {
		return true;
	}

}
