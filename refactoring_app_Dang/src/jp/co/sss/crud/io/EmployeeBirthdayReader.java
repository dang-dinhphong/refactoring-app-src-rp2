package jp.co.sss.crud.io;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import jp.co.sss.crud.util.ConstantMsg;

/**
 * 生年月日の入力バリデーションチェッククラス
 */
public class EmployeeBirthdayReader implements IConsoleReader {

	/**
	 * バリデーションチェック時のエラーメッセージ表示
	 */
	@Override
	public String getErrorMsg() {
		return ConstantMsg.VALID_DATE;
	}

	/**
	 * 入力した文字列の値が適正かどうかによる実行処理
	 */
	@Override
	public boolean isValid(String inputString) {
		SimpleDateFormat sdf = new SimpleDateFormat(ConstantMsg.REGEX_DATE);
		sdf.setLenient(false);
		try {
			sdf.parse(inputString);
		} catch (ParseException | IllegalArgumentException e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isParseInt() {
		return false;
	}

}
