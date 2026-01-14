package jp.co.sss.crud.main;

import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;
import jp.co.sss.crud.io.IConsoleReader;
import jp.co.sss.crud.io.MenuNoReader;
import jp.co.sss.crud.service.IEmployeeService;
import jp.co.sss.crud.util.ConstantValue;

/**
 * 社員情報管理システム開始クラス 社員情報管理システムはこのクラスから始まる。<br/>
 * メニュー画面を表示する。
 *
 * @author System Shared
 *
 */
public class MainSystem {

	/**
	 * 社員管理システムを起動
	 * 
	 * 入力したメニュー番号によるサービスをインスタンス生成し機能実行する
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int menuNo = 0;
		IConsoleReader reader = new MenuNoReader();

		do {
			try {
				ConsoleWriter.showMenu();
				menuNo = (int) reader.input();
				IEmployeeService service = IEmployeeService.getInstanceByMenuNo(menuNo);
				if (service != null) {
					service.execute();
				}
			} catch (IllegalInputException e) {//ユーザの入力ミスをcatchし、やり直す
				System.out.println(e.getMessage());
				System.out.println();
				continue;
			} catch (SystemErrorException e) {//システム側のエラーが発生した場合は終了
				System.out.println(e.getMessage());
				e.printStackTrace();
				break;
			}

		} while (menuNo != ConstantValue.MENU_SHUT_DOWN_NO);
		ConsoleWriter.showShutDown();
	}
}
