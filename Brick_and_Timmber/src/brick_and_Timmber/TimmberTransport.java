package brick_and_Timmber;

public class TimmberTransport extends GoodsTransport {
	

	private float timmberLength;
	private float timmberRadius;
	private String timmberType;
	private float timmberPrice;
	
	//Include 8 argument Constructor
	public TimmberTransport(String transportId, String transportDate, int transportRating, String transportType,
			float timmberLength, float timmberRadius, String timmberType, float timmberPrice) {
		super(transportId, transportDate, transportRating, transportType);
		this.timmberLength = timmberLength;
		this.timmberPrice = timmberPrice;
		this.timmberRadius = timmberRadius;
		this.timmberType = timmberType;
		// TODO Auto-generated constructor stub
	}

	
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
		if(Area <= 400 && Area >= 250) {
			return "Lorry";
		}
		else if(Area < 250) {
			return "Truck";
		}
		else if(Area > 400) {
			return "MonsterLorry";
		}
		return VehicleType;
	}
	public float calculateTotalCharge() {
		float Volume = (float) (3.147 * timmberRadius * timmberRadius * timmberLength);
		float timmberTypeValue =0;
		if(timmberType == "Premium") timmberTypeValue = 0.25f;
		else timmberTypeValue = 0.15f;
		float price = Volume * timmberPrice * timmberTypeValue;
		int Tax = (int) (price * 0.3);
		String Vehicle_Type = vehicleSelection();
		int Vehicle_price =0;
		if(Vehicle_Type == "Truck"){
			Vehicle_price = 1000;
		}
		else if(Vehicle_Type == "Lorry") {
			Vehicle_price = 3000;
		}
		else if(Vehicle_Type == "MonterLorry") {
			Vehicle_price = 5000;
		}
		
		//calculating the discount
		float discount =0;
		if (transportRating == 5) {
			discount= (float) (price * 0.2);
		}
		else if(transportRating == 3 || transportRating == 4) {
			discount= (float) (price * 0.1);
		}
		else  {
			discount= 0;
		}
		
		
		//calculating total_price
		int total_charge = (int) (((price) + Vehicle_price + Tax) - discount);
		return total_charge;
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	}
