package jp.co.sss.crud.exception;

/**
 * 例外をまとめて送出する独自例外クラス
 * システム側ミス・エラー
 */
public class SystemErrorException extends Exception {
	/**
	 * 独自例外送出
	 * @param errorMsg
	 */
	public SystemErrorException(String errorMsg) {
		super(errorMsg);
	}

	/**
	 * 独自例外送出、原因あり
	 * @param errorMsg
	 * @param cause
	 */
	public SystemErrorException(String errorMsg, Throwable cause) {
		super(errorMsg, cause);
	}

}
