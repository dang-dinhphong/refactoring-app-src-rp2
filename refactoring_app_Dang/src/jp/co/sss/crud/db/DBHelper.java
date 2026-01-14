package jp.co.sss.crud.db;

import java.sql.Connection;

import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * DB接続クラス
 */
public class DBHelper {
	/**
	 * ラムダ式（DAOの処理）を受け取るための関数型インターフェース
	 * 
	 */
	@FunctionalInterface
	public interface SQLProcess<T> {
		//throws Exceptionをつけることで、DAO側でのtry-catchを不要にする
		T run(Connection connect) throws Exception;
	}

	/**
	 * Connectionの取得、処理の実行、例外の変換、クローズをすべて行う関数型メソッド
	 * <T>：型のパラメータの宣言、T：戻り値の型
	 * try()でメモリリーク防止（close()処理は必ず実行される）
	 */
	public static <T> T execute(SQLProcess<T> process) throws SystemErrorException {
		try (Connection connect = DBManager.getConnection()) {
			return process.run(connect);
		} catch (Exception e) {
			throw new SystemErrorException(ConstantMsg.MSG_SYS_ERROR, e);
		}
	}
}
