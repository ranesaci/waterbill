package waterbill.watertype;

public class BoreWellWater implements WaterType {
	double costPerLiter = 1.5;

	@Override
	public int processWaterTypeCost(int totalWater) {
		
		return (int) Math.round(totalWater*costPerLiter);
	}

}
