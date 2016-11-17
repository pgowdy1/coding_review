package airport;

import java.util.*;

public class TextUserInterface {

	private ArrayList<Plane> planesInAir = new ArrayList<Plane>();
	private ArrayList<Flights> flightsInAir = new ArrayList<Flights>();

	public void runAirportPanel(Scanner reader) {

		String userChoice = "";

		while (userChoice.equals("x") == false) {
			printAirportMenu();
			userChoice = reader.nextLine();

			if (userChoice.equals("1")) {
				System.out.println("Enter the Plane ID: ");
				String planeID = reader.nextLine();
				System.out.println("Enter the Capacity: ");
				String planeCapacity = reader.nextLine();

				planesInAir.add(new Plane(planeID, Integer.parseInt(planeCapacity)));
			
			}

			else if (userChoice.equals("2")) {
				System.out.println("Give Plane ID: ");
				String planeID = reader.nextLine();
				System.out.println("Give departure airport code: ");
				String depCode = reader.nextLine();
				System.out.println("Give destination airport code: ");
				String destCode = reader.nextLine();

				flightsInAir.add(new Flights(planeID, depCode, destCode)); 
				
			}
		}
	}

	public void runFlightServicePanel(Scanner reader, ArrayList<Plane> planesInAirPara, ArrayList<Flights> flightsPara) {

		String userChoice = "";
		String planeID;

		while (userChoice.equals("x") == false) {
			printFlightServiceMenu();
			userChoice = reader.nextLine();

			if (userChoice.equals("1")) {
				printPlanesInAir(planesInAir);
			}

			else if (userChoice.equals("2")) {
				printFlightsInAir(flightsInAir, planesInAir);
			}

			else if (userChoice.equals("3")) {
				System.out.println("Give plane ID: ");
				planeID = reader.nextLine();

				for (Plane curPlane : planesInAir) {
					if (curPlane.getPlaneID().equals(planeID)) {
						System.out.println(curPlane.getPlaneID() + " (" + curPlane.getplaneCapacity() + ") ");
					}

					else {

					}
				}
			}
		}
	}

	private static void printPlanesInAir(ArrayList<Plane> planesInAir) {
		for (Plane curPlane : planesInAir) {
			System.out.print(curPlane.getPlaneID() + " " + curPlane.getplaneCapacity() + "\n");
		}
	}

	private static void printFlightsInAir(ArrayList<Flights> flightsInAir, ArrayList<Plane> planesInAir) {
		for (Flights curFlight : flightsInAir) {
			System.out.print(curFlight.getPlaneID() + " ");

			for (Plane curPlane : planesInAir) {
				if (curPlane.getPlaneID().equals(curFlight.getPlaneID())) {
					System.out.print("(" + curPlane.getplaneCapacity() + ") ");
				}
			}

			System.out.println(curFlight.getDepCode() + "-" + curFlight.getDestCode());
		}
	}

	private static void printAirportMenu() {
		System.out.print("Choose Operation: \n" + "[1] Add airplane\n" + "[2] Add flight\n" + "[x] Exit\n");
	}

	private static void printFlightServiceMenu() {
		System.out.print("Choose Operation: \n" + "[1] Print planes\n" + "[2] Print flights\n"
				+ "[3] Print plane info\n" + "[x] Quit\n");
	}

	public ArrayList<Plane> getPlanesInAir() {
		return planesInAir;
	}

	public ArrayList<Flights> getFlights() {
		return flightsInAir;
	}

}