package airport;

import java.util.*;
import java.util.Scanner;

public class Plane {

	private String planeID = "";
	private int planeCapacity = 0;

	public Plane() {

	}

	public Plane(String inputPlane, int inputCap) {
		this.planeID = inputPlane;
		this.planeCapacity = inputCap;
	}

	public String getPlaneID() {
		return this.planeID;
	}

	public int getplaneCapacity() {
		return this.planeCapacity;
	}

	public void setPlaneID(String inputPlane) {
		this.planeID = inputPlane;
	}

	public void setPlaneCapacity(int inputCap) {
		this.planeCapacity = inputCap;
	}
}
