package brick_and_Timmber;

public class TimmberTransport extends GoodsTransport {
	
	private float timmberLength;
	private float timmberRadius;
	private String timmberType;
	private float timmberPrice;
	
	public float getTimmberLength() {
		return timmberLength;
	}
	public void setTimmberLength(float timmberLength) {
		this.timmberLength = timmberLength;
	}

	public float getTimmberRadius() {
		return timmberRadius;
	}
	public void setTimmberRadius(float timmberRadius) {
		this.timmberRadius = timmberRadius;
	}
	public String getTimmberType() {
		return timmberType;
	}
	public void setTimmberType(String timmberType) {
		this.timmberType = timmberType;
	}
	public float getTimmberPrice() {
		return timmberPrice;
	}
	public void setTimmberPrice(float timmberPrice) {
		this.timmberPrice = timmberPrice;
	}
	
	
	public String vehicleSelection() {
		String VehicleType = null;
		float Area = (float) (2 * 3.147 * timmberRadius * timmberLength);
		if(Area <= 400 && Area > 200) {
			return "Lorry";
		}
		else if(Area <= 250) {
			return "Truck";
		}
		else if(Area > 400) {
			return "MosterLorry";
		}
		return VehicleType;
	}
}
