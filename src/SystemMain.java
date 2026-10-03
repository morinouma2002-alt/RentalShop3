import java.util.Scanner;

import Manager.AiManager;
import Manager.Manager;
import Manager.ZaikoKanri;
import Screen.TopMenu;

public class SystemMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//在庫を読み込む
		ZaikoKanri zaikokanri = new ZaikoKanri();

		AiManager ai = new AiManager("管理者", 0,zaikokanri,sc);
	

		Manager[] manager = { new Manager("太郎", 1000,zaikokanri,sc) };

		for (int i = 0; i < manager.length; i++) {
			AiManager man = manager[i];//継承関係あるので、AIManagerでいける
			
			//manは　AiManager型　実体Manager型
			
			ai.setManager(man);//管理者が社員を管理する
		}

		TopMenu topMenu = new TopMenu(zaikokanri, sc, ai);
		topMenu.display(sc);

		sc.close();

	}

}