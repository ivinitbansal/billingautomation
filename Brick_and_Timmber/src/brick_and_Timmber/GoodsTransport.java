package brick_and_Timmber;

public abstract class GoodsTransport {
	protected String transportId;
	protected String transportDate;
	protected int transportRating;
	protected String transportType;
	
	
	//Include 4 argument Constructor
	public GoodsTransport(String transportId, String transportDate, int transportRating, String transportType) {
		this.transportDate = transportDate;
		this.transportId = transportId;
		this.transportRating = transportRating;
		this.transportType = transportType;
	}
	
	
	public String getTransportId() {
		return transportId;
	}
	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}
	
	public String getTransportDate() {
		return transportDate;
	}
	public void setTransportDate(String transportDate) {
		this.transportDate = transportDate;
	}
	
	public int getTransportRating() {
		return transportRating;
	}
	public void setTransportRating(int transportRating) {
		this.transportRating = transportRating;
	}
	
	public String getTransportType() {
		return transportType;
	}
	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}
	
	//Include Abstract method
	//Fill the code here
	abstract public String vehicleSelection();
	abstract public float calculateTotalCharge();
	
}
