package waterbill.apartment;

import waterbill.helper.WaterTypeCostHelper;
import waterbill.util.WaterBillUtils;
import waterbill.watertype.BoreWellWater;
import waterbill.watertype.CorporationWater;
import waterbill.watertype.TankerWater;

public class TwoBhkApartment implements ApartMent{
	int guests = 0;
	
	public TwoBhkApartment(int guests) {
		this.guests = guests;
	}
	
	private int NO_OF_PEOPLE = 3;

	@Override
	public int calculateTotalWater() {
		
		return WaterBillUtils.calculateMonthlyWater(NO_OF_PEOPLE);
	}
	
	@Override
	public int calculateCost(int totalWater, String ratio) {
		int totalCost = 0;
		//find carporation water and borewell cost
		int[] waterParts = WaterBillUtils.getWaterParts(totalWater, ratio);
		WaterTypeCostHelper waterTypeCostHelper = new WaterTypeCostHelper(new CorporationWater());
		totalCost = waterTypeCostHelper.processWaterTypeCost(waterParts[0]);
		
		waterTypeCostHelper = new WaterTypeCostHelper(new BoreWellWater());
		totalCost += waterTypeCostHelper.processWaterTypeCost(waterParts[1]);
		
		//add tanker water
		if (guests > 0) {
			int tankerWater = WaterBillUtils.calculateMonthlyWater(guests);
			waterTypeCostHelper = new WaterTypeCostHelper(new TankerWater());
			totalCost += waterTypeCostHelper.processWaterTypeCost(tankerWater);
		}
		
		
		return totalCost;
		
		
		
	}

}
