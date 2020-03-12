package aircraft;

/**
 * An aircraft. Abstract Parent class of flying vehicles (aerostats and aerodynes) that may or may not be granted clearance for takeoff from an airport with controlled airspace.
 *
 * @author Benjamin Blocksom
 *
 */
public abstract class Aircraft implements Comparable<Aircraft> {
	String registration; // tail number
	String modelName;
//	Usage usage;

	
	private static String restrictedRegistrationPrefix = "CU"; // aircraft registered to the country of Cuba is restricted.
	

	abstract void takeOff();
	abstract void lands();
	
	void squawk() {
		System.out.println("This " + this.modelName + " has tail number " + this.registration + ".");
	}

	void clearForTakeOff() {
		System.out.println(this.modelName + " with tail number " + this.registration + " is cleared for takeoff on Runway 19.");
		//The runway is hardcoded as an imaginary magnetic azimuth of the runway's heading in decadegrees.
	}
	
	void clearForLanding() {
		System.out.println(this.modelName + " with tail number " + this.registration + " is cleared for landing on Runway 19.");
	}
	
	void isTransporting(String... cargo) {
		System.out.print(this.modelName + " is transporting ");
		try { if(cargo.length == 1) {
			System.out.println(cargo[0] + ".");
		} else {for(int i=0; i<cargo.length-1; i++) {
	        System.out.print(cargo[i] + ", ");
	      	}
	   	  	System.out.print("and " + cargo[cargo.length-1] + ".");
	   	  	
	   	  	System.out.println();
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("EXCEPTION: ArrayIndexOutOfBoundsException in isTransporting. Cargo declaration cannot be integer 0.");
		}
	}
	  @Override
	  // sort aircraft 
	  public int compareTo(Aircraft o) {
	    return this.modelName.compareTo(o.modelName);
	  }

}
