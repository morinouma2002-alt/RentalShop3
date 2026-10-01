package Guest;

public class postponeGuest extends Guest {
	public postponeGuest(Guest other) {
		super(other);
	}

	@Override
	public boolean canRent() {
		return false;
	}
}