package jp.co.sss.crud.io;

import jp.co.sss.crud.util.ConstantMsg;

/**
 * 性別の入力バリデーションチェッククラス
 */
public class EmployeeGenderReader implements IConsoleReader {

	/**
	 * バリデーションチェック時のエラーメッセージ表示
	 */
	@Override
	public String getErrorMsg() {
		return ConstantMsg.VALID_GENDER;
	}

	/**
	 * 入力した文字列の値が適正かどうかによる実行処理
	 */
	@Override
	public boolean isValid(String inputString) {
		return inputString.matches(ConstantMsg.REGEX_GENDER);
	}

	@Override
	public boolean isParseInt() {
		return true;
	}

}
