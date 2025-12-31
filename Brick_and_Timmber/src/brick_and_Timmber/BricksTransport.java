package brick_and_Timmber;

public class BricksTransport extends GoodsTransport{

	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	
	//Include 7 argument Constructor
	public BricksTransport(String transportId, String transportDate, int transportRating, String transportType,
			float brickSize, int brickQuantity, float brickPrice) {
		super(transportId, transportDate, transportRating, transportType);
		this.brickPrice = brickPrice;
		this.brickQuantity = brickQuantity;
		this.brickSize = brickSize;
		// TODO Auto-generated constructor stub
	}
	
	
	public float getBrickSize() {
		return brickSize;
	}
	
	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}
	
	public int getBrickQuantity() {
		return brickQuantity;
	}
	
	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}
	
	public float getBrickPrice() {
		return brickPrice;
	}
	
	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	
	public String vehicleSelection() {
		String transportType = null;
		if(brickQuantity < 300) {
			transportType = "Truck";
		}
		else if(brickQuantity >= 300 && brickQuantity <= 500) {
			transportType = "Lorry";
		}
		else if(brickQuantity > 500) {
			transportType = "MonsterLorry";
		}
		return transportType;
	}
	
	public float calculateTotalCharge() {
		float price = brickPrice * brickQuantity;
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
			discount= price * 0.2f;
		}
		else if(transportRating == 3 || transportRating == 4) {
			discount= price * 0.1f;
		}
		else  {
			discount= 0;
		}
		
		
		//calculating total_price
		int total_charge = (int) (((price) + Vehicle_price + Tax) - discount);
		return total_charge;
	}

}
 