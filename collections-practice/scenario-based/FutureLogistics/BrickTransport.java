package scenario.FutureLogistics;

public class BrickTransport extends GoodsTransport {

	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	
	public BrickTransport(String transportId,String transportDate,int transportRating, 
			float brickSize, int brickQuantity, float brickPrice) {
		
		super(transportId,transportDate,transportRating);
		this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
		
	}
	
	public float getBrickSize() {
        return brickSize;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }
    
    @Override
    public String vehicleSelection() {
        if (brickQuantity < 300) {
            return "Truck";
        } else if (brickQuantity <= 500) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }
    
    @Override
    public float calculateTotalCharge() {
        float price = brickPrice * brickQuantity;
        float tax = price * 0.30f;
        float discount = Utility.calculateDiscount(price, transportRating);
        float vehiclePrice = Utility.getVehiclePrice(vehicleSelection());

        return (price + tax + vehiclePrice) - discount;
    }
}
