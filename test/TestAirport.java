package test;

import java.io.*;
import airport.*;
import org.junit.Test;
import junit.framework.*;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.*;

public class TestAirport extends TestCase {

	@Test
	public void testAirport() {

		try {
			TextUserInterface airport = new TextUserInterface();
			
			File file = new File("C:\\Users\\perry\\Documents\\GitHub\\coding_review\\test\\testCases.txt");
			System.err.println(file.getAbsolutePath());
			Scanner reader = new Scanner(file);			

			airport.runAirportPanel(reader);

			while (reader.hasNextLine()) {
				System.out.println(reader.nextLine()); 
				
			}
			reader.close(); 
		}

		catch (Exception ex) {
			
			System.out.println("WE'RE FUCKED BRO. WE'RE FUCKING FUCKED.");
			ex.printStackTrace();
		}

	}

	public void tearDown() {

	}

}