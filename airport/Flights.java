package airport;

public class Flights {

	private String planeID = "";
	private String depCode = "";
	private String destCode = "";

	public Flights(String planeID, String depCode, String destCode) {
		this.planeID = planeID;
		this.depCode = depCode;
		this.destCode = destCode;
	}

	public String getPlaneID() {
		return this.planeID;
	}

	public String getDepCode() {
		return this.depCode;
	}

	public String getDestCode() {
		return this.destCode;
	}
}
