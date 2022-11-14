package waterbill.watertype;

import waterbill.delegation.TankerWaterChain;
import waterbill.delegation.TankerWaterChainInvoker;

public class TankerWater implements WaterType {
	

	@Override
	public int processWaterTypeCost(int totalWater) {
		TankerWaterChain tankerWaterChain = TankerWaterChainInvoker.getChain();
		
		return tankerWaterChain.process(totalWater);
	}

}
