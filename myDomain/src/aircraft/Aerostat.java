package aircraft;

public class Aerostat extends Aircraft implements RegistrationValid {
	Aerostat(){
		super();
	};

	Aerostat(String modelName){
		this();
		this.modelName = modelName;
	};

	Aerostat(String modelName, String registration){
		this(modelName);
		this.registration = registration;
	};

	void takeOff() {
		System.out.println(this.modelName + " takes off.");
	}

	public String toString(){
		return this.modelName + "";
	}

	@Override
	void lands() {
		// TODO Auto-generated method stub

	}
}
