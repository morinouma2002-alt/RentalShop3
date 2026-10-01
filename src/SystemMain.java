import java.util.Scanner;

import Manager.Manager;
import Manager.ZaikoKanri;
import Screen.TopMenu;

public class SystemMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//在庫を読み込む
		ZaikoKanri zaikokanri = new ZaikoKanri();

		Manager manager =new Manager();
		TopMenu topMenu = new TopMenu(zaikokanri, sc,manager);
		topMenu.display(sc);

		sc.close();

	}

}