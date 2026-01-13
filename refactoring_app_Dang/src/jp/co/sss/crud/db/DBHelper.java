package jp.co.sss.crud.db;

import java.sql.Connection;

import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * DB接続クラス
 */
public class DBHelper {
	/**
	 * ラムダ式（DAOの処理）を受け取るためのインターフェース
	 */
	@FunctionalInterface
	public interface SQLProcess<T> {
		// throws Exception をつけることで、DAO側での try-catch を不要にする
		T run(Connection conn) throws Exception;
	}

	/**
	 * Connectionの取得、処理の実行、例外の変換、クローズをすべて行う
	 */
	public static <T> T execute(SQLProcess<T> process) throws SystemErrorException {
		// try-with-resources で接続を確実に閉じる
		try (Connection connect = DBManager.getConnection()) {
			return process.run(connect);
		} catch (Exception e) {
			// ここで SQLException や ClassNotFoundException を一括変換
			throw new SystemErrorException(ConstantMsg.MSG_SYS_ERROR, e);
		}
	}
}
