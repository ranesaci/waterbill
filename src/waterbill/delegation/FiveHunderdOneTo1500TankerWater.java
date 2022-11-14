package waterbill.delegation;

public class FiveHunderdOneTo1500TankerWater implements TankerWaterChain{

	TankerWaterChain tankerWaterChain;
	@Override
	public void next(TankerWaterChain tankerWaterChain) {
		this.tankerWaterChain = tankerWaterChain;
		
	}

	@Override
	public int process(int waterInLiter) {
		int amount = 0;
		if (waterInLiter <= 1000) {
			amount = waterInLiter * 3;
		}
		else {
			amount = (1000*3) + tankerWaterChain.process(waterInLiter-1000);
		}
		
		return amount;
	}

}
