package aircraft;

import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {

		Aerostat balloon = new Aerostat("Goodyear Blimp", "CU123");
		balloon.squawk();
		balloon.takeOff();
		balloon.clearForLanding();
		balloon.clearForTakeOff();
		balloon.checkRegistration();
		
		Aerodyne cessna = new Aerodyne("Cessna 172", "N367HP");
		cessna.squawk();
		cessna.takeOff();
		cessna.clearForLanding();
		cessna.clearForTakeOff();
		
		SortedSet<Aerodyne> myAerodynes = new TreeSet<Aerodyne>();
		myAerodynes.add(cessna);
		myAerodynes.add(new Aerodyne("14-Bis", ""));
		myAerodynes.add(new Aerodyne("Embraer Phenom", "PT123"));
		myAerodynes.add(new Aerodyne("Boeing NB-52B", "52-008"));
		System.out.println("Airplanes sorted alphabetically: " + myAerodynes);
		
		try {
		cessna.isTransporting("hazardous materials");
		cessna.isTransporting("hazardous materials", "perishable goods", "snacks");
		
		cessna.isTransporting();
		// unchecked exception
		cessna.isTransporting(null);
		} catch (NullPointerException e) {
			System.out.println("-null-\nEXCEPTION: NullPointerException. Cargo declaration cannot be null");
		}
	}
}
