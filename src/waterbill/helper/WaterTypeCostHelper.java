package waterbill.helper;

import waterbill.watertype.WaterType;

public class WaterTypeCostHelper {
	
	WaterType waterType;
	
	public WaterTypeCostHelper(WaterType waterType) {
		this.waterType = waterType;
	}
	
	public int processWaterTypeCost(int totalWater) {
		return waterType.processWaterTypeCost(totalWater);
	}

}
