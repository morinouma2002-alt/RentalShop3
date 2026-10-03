package Screen;

import java.util.List;
import java.util.Scanner;

import DVD.DVD;
import Guest.Guest;
import Guest.normalGuest;
import Guest.postponeGuest;
import Manager.AiManager;

public class ReturnMenu implements Menu {

	//EndDayと同じ感じにする
	
	private Guest guest;
	private AiManager manager;
	private List<Guest> list;
	private Guest result;   // 処理後の客（TopMenu が受け取る）

	//★★Guest guestは　normalか　postponeの可能性がある　guest変数名
	public ReturnMenu(Guest guest, AiManager manager, List<Guest> list) {
		this.guest = guest;
		this.manager = manager;
		this.list = list;
		this.result = guest;   // 変わらなければそのまま
	}

	@Override
	public void display(Scanner sc) {
		List<DVD> dvdSave = guest.getDvdSave();

		if (dvdSave.size() == 0) {
			System.out.println("返却する必要はないです");
			return;
		}

		System.out.println("あなたが、現在借りている作品は");
		for (int i = 0; i < dvdSave.size(); i++) {
			DVD d = dvdSave.get(i);
			System.out.println((i + 1) + "番目;" + d.getName());
		}

		System.out.println("返却するのを番号で選んでください");
		int n = sc.nextInt() - 1;

		DVD d = dvdSave.remove(n);
		d.returnRented();

		// 延滞客が、全部返し終わったときだけ通常客に戻す
		if (guest instanceof postponeGuest && dvdSave.isEmpty()) {
			System.out.println("延滞料として500円徴収します");
			manager.postAssets();

			Guest normal = new normalGuest(guest);//★★　コピー　自分自身を再利用
			list.set(list.indexOf(guest), normal);
			System.out.println("通常客に戻ります");
			result = normal;
		}
	}

	public Guest getResult() {
		return result;
	}

	@Override
	public Guest productGuest(List<Guest> list) {
		return null;
	}
}