package Screen;

import java.util.List;
import java.util.Scanner;

import Guest.Guest;

public interface Menu {
	//deffaultをなるべく、使わない
	
	//ポリモーフィズムを使う
	void display(Scanner sc);
	Guest productGuest(List<Guest> list);
	
}
