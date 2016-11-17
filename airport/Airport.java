package airport;

import java.util.*;

public class Airport {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		TextUserInterface ui = new TextUserInterface();
		ui.runAirportPanel(reader);
		ui.runFlightServicePanel(reader, ui.getPlanesInAir(), ui.getFlights());
	}

}
