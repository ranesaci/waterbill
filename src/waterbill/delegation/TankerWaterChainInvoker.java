package waterbill.delegation;

public class TankerWaterChainInvoker {
	
	private static ZeroTo500TankerWater zeroTo500TankerWater = new ZeroTo500TankerWater();
	private static FiveHunderdOneTo1500TankerWater fiveHunderdOneTo1500TankerWater = new FiveHunderdOneTo1500TankerWater();
	private static FifteenHunderdOneTo3000TankerWater fifteenHunderdOneTo3000TankerWater = new FifteenHunderdOneTo3000TankerWater();
	private static ThreeKOneAndMoreTankerWater threeKOneAndMoreTankerWater = new ThreeKOneAndMoreTankerWater();
	
	
	public static TankerWaterChain getChain() {
		zeroTo500TankerWater.next(fiveHunderdOneTo1500TankerWater);
		fiveHunderdOneTo1500TankerWater.next(fifteenHunderdOneTo3000TankerWater);
		fifteenHunderdOneTo3000TankerWater.next(threeKOneAndMoreTankerWater);
		return zeroTo500TankerWater;
	}

}
