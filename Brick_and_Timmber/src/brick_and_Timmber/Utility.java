package brick_and_Timmber;

public class Utility {
	
	public GoodsTransport parseDetails(String input)
	{
		GoodsTransport obj = new GoodsTransport;
//      fill the code here
		if(input == null || input.isEmpty()) {
			return null;
		}
		String[] data = input.split(",");
		String transportId = data[0];
		String transportDate = data[1];
		int transportRating = Integer.parseInt(data[2]);
		String transportType = data[3];
		
		if(!validateTransportId(transportId)) {
			System.out.println("Please provide a valid record");
			return null;
		}
		
		if(transportType.equalsIgnoreCase("BrickTransport")) {
			return new BrickTransport(brickSize, brickQuantity, brickPrice);
		}
		return null;
		
		
		
	}
	
	public boolean validateTransportId(String transportId)
	{
		//Fill the code here
		if(transportId == null) {
			return false;		
		}
		
		//Regex
		//Exactly 3 letters RTS
		// 3 digit no. //d{3}
		// 1 letter form A to Z [A-Z]
		String regex = "RTS//d{3}[A-Z]";
		
		return transportId.matches(regex);
	}

}
