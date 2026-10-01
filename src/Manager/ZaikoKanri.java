package Manager;

import DVD.DVD;

public class ZaikoKanri {

	private DVD[] dvd = { new DVD("ミッション", "秋", "新作", 5, 12), new DVD("博士", "太郎", "普通", 6, 11),
			new DVD("先生", "山", "旧作", 12, 30),
			new DVD("情報", "冬", "新作", 1, 1), new DVD("可能", "玲子", "普通", 4, 11), new DVD("定め", "配列", "旧作", 5, 23) };

	public DVD[] getDVD() {
		return dvd;
	}

}