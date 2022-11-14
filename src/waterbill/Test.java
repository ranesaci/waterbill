package waterbill;

import waterbill.apartment.ApartmentType;
import waterbill.service.IWaterBillService;
import waterbill.service.WaterBillServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		
		IWaterBillService waterBillService = new WaterBillServiceImpl(ApartmentType.TWO_BHK, "3:7");
		waterBillService.addGuests(2);
		waterBillService.addGuests(3);
		waterBillService.bill();
		

	}

}
