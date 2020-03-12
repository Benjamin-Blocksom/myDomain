package aircraft;

public interface RegistrationValid {
	default void checkRegistration() {
		System.out.println("Aircraft has valid registration.");
	}
}