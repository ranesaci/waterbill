package waterbill.delegation;

public class ZeroTo500TankerWater implements TankerWaterChain{

	TankerWaterChain tankerWaterChain;
	@Override
	public void next(TankerWaterChain tankerWaterChain) {
		this.tankerWaterChain = tankerWaterChain;
		
	}

	@Override
	public int process(int waterInLiter) {
		int amount = 0;
		if (waterInLiter <= 500) {
			amount = waterInLiter * 2;
		}
		else {
			amount = (500*2) + tankerWaterChain.process(waterInLiter-500);
		}
		
		return amount;
	}

}
