package waterbill.delegation;

public class FifteenHunderdOneTo3000TankerWater implements TankerWaterChain{

	TankerWaterChain tankerWaterChain;
	@Override
	public void next(TankerWaterChain tankerWaterChain) {
		this.tankerWaterChain = tankerWaterChain;
		
	}

	@Override
	public int process(int waterInLiter) {
		int amount = 0;
		if (waterInLiter <= 1500) {
			amount = waterInLiter * 5;
		}
		else {
			amount = (1500*5) + tankerWaterChain.process(waterInLiter-1500);
		}
		
		return amount;
	}

}
