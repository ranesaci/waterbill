package waterbill.watertype;

public class CorporationWater implements WaterType {
	int costPerLiter = 1;

	@Override
	public int processWaterTypeCost(int totalWater) {
		
		return Math.round(totalWater*costPerLiter);
	}

}
