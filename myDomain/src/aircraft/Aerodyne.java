package aircraft;

import java.io.Serializable;

public class Aerodyne extends Aircraft implements Serializable {
	Aerodyne(){
		super();
	};

	Aerodyne(String modelName){
		this();
		this.modelName = modelName;
	};

	Aerodyne(String modelName, String registration){
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
