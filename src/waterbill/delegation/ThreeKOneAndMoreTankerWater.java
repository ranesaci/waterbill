package waterbill.delegation;

public class ThreeKOneAndMoreTankerWater implements TankerWaterChain{

	TankerWaterChain tankerWaterChain;
	@Override
	public void next(TankerWaterChain tankerWaterChain) {
		this.tankerWaterChain = tankerWaterChain;
		
	}

	@Override
	public int process(int waterInLiter) {
		int amount = 0;
		amount = waterInLiter * 8;
		
		return amount;
	}

}
