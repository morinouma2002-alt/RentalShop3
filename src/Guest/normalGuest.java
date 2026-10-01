package Guest;

public class normalGuest extends Guest {

	public normalGuest(String name) {
		super(name);//スーパーコンストラクタに渡す
	}
	
	public normalGuest(Guest other) {
		super(other);
		clearOverDue();
	}
}
