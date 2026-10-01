package Screen;

import java.util.List;
import java.util.Scanner;

import Guest.Guest;

public class Register implements Menu {

	private Guest guest;

	public Register(Guest guest) {

		this.guest = guest;
	}

	@Override
	public void display(Scanner sc) {

		String textBlock = """
				あなたは、現在非会員登録者ですショップの会員になりますか
				YESと入力してください
				""";
		System.out.println(textBlock);

		boolean register = sc.next().equals("YES");

		if (register) {
			System.out.println("登録します");
			guest.setRegister();

		} else {
			System.out.println("登録しません");
		}
	}

	@Override
	public Guest productGuest(List<Guest> list) {
		return null;
	}
}
