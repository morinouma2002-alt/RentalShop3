package Guest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DVD.DVD;

public class Guest {

	public Scanner sc = new Scanner(System.in);

	protected String name;

	private Guest postGuest;//延滞客になったら使う

	//始めは、未会員登録
	protected boolean register = false;

	//始めは、falseで通常客として処理する
	private boolean overDue = false;

	//guestが借りた、商品を貯める
	protected List<DVD> dvdSave = new ArrayList<>();

	public Guest(String name) {
		this.name = name;
	}

	public Guest(Guest other) {
		this.name = other.name;
		this.register = other.register;
		this.overDue = other.overDue;//★★　clearOverdue()の必要な部分
		this.dvdSave = other.dvdSave;//同じリストを引き継ぐ
	}

	public List<DVD> getDvdSave() {
		return dvdSave;
	}

	public boolean canRent() {
		return true;
	}

	public boolean getResister() {
		return register;
	}

	public String getName() {
		return name;
	}

	public void setRegister() {
		this.register = true;
	}

	public void clearOverDue() {
		overDue = false;
	}

	public boolean getOverDue() {
		return overDue;
	}

	public void checkOverDay(DVD dvd) {
		boolean found = dvd.getOverDay();
		if (found == true) {
			overDue = found;//延滞客に分類された
		}
	}

	//続き
	public void displayRegister() {
		
		if (register) {
			System.out.println(name + "様");

			if (dvdSave.size() == 0) {
				System.out.println("借りているDVDはありません");
			} else {
				System.out.println("借りているDVDは");
				for (int i = 0; i < dvdSave.size(); i++) {
					DVD d = dvdSave.get(i);
					System.out.println(d.getName());
				}
			}

			if (overDue) {
				System.out.println("延滞客");
			} else {
				System.out.println("通常客");
			}
		}
	}
}
