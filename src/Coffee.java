public class Coffee {
	
	private int coffeeId;
	private String coffeeName;
	private int espressoAmount;
	private int hotWaterAmount;
	private int steamedMilkAmount;
	private int milkFoamAmount;
	private int hotChocolateAmount;
	private int coffeePrice;
	
	public Coffee(int coffeeId, String coffeeName, int espressoAmount, int hotWaterAmount, 
			int steamedMilkAmount, int milkFoamAmount, int hotChocolateAmount, int coffeePrice) {
		this.coffeeId = coffeeId;
		this.coffeeName = coffeeName;
		this.espressoAmount = espressoAmount;
		this.hotWaterAmount = hotWaterAmount;
		this.steamedMilkAmount = steamedMilkAmount;
		this.milkFoamAmount = milkFoamAmount;
		this.hotChocolateAmount = hotChocolateAmount;
		this.coffeePrice = coffeePrice;
	}

	public int getCoffeeId() {
		return coffeeId;
	}


	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}


	public String getCoffeeName() {
		return coffeeName;
	}


	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}


	public int getEspressoAmount() {
		return espressoAmount;
	}


	public void setEspressoAmount(int espressoAmount) {
		this.espressoAmount = espressoAmount;
	}


	public int getHotWaterAmount() {
		return hotWaterAmount;
	}


	public void setHotWaterAmount(int hotWaterAmount) {
		this.hotWaterAmount = hotWaterAmount;
	}


	public int getSteamedMilkAmount() {
		return steamedMilkAmount;
	}


	public void setSteamedMilkAmount(int steamedMilkAmount) {
		this.steamedMilkAmount = steamedMilkAmount;
	}


	public int getMilkFoamAmount() {
		return milkFoamAmount;
	}


	public void setMilkFoamAmount(int milkFoamAmount) {
		this.milkFoamAmount = milkFoamAmount;
	}


	public int getHotChocolateAmount() {
		return hotChocolateAmount;
	}


	public void setHotChocolateAmount(int hotChocolateAmount) {
		this.hotChocolateAmount = hotChocolateAmount;
	}


	public int getCoffeePrice() {
		return coffeePrice;
	}


	public void setCoffeePrice(int coffeePrice) {
		this.coffeePrice = coffeePrice;
	}

}
