package DVD;

//継承関係はないはず
public class Detail {

	private String direc;
	private int month;
	private int day;

	private boolean rented;

	public Detail(String direc, int month, int day, boolean rented) {
		this.direc = direc;
		this.month = month;
		this.day = day;
		this.rented = rented;
	}

	public void display() {
		if (rented) {
			System.out.println("監督名は：" + direc);
			System.out.println("製造日は：" + month + "月" + day + "日です");

		} else {
			System.out.println("現在は、借りられていますが");

			System.out.println("監督名は：" + direc);
			System.out.println("製造日は：" + month + "月" + day + "日です");
		}
	}
}
