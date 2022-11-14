package waterbill.service;

import java.util.ArrayList;
import java.util.List;

import waterbill.apartment.ApartMent;
import waterbill.apartment.ApartmentType;
import waterbill.apartment.ThreeBhkApartment;
import waterbill.apartment.TwoBhkApartment;
import waterbill.util.WaterBillUtils;

public class WaterBillServiceImpl implements IWaterBillService{
	
	private ApartmentType apartmentType;
	private String ratio;
	private List<Integer> guests = null;

	public WaterBillServiceImpl(ApartmentType apartmentType, String ratio) {
		this.apartmentType = apartmentType;
		this.ratio = ratio;
		guests = new ArrayList<>();
		
	}

	@Override
	public void addGuests(int guests) {
		this.guests.add(guests);
		
	}

	@Override
	public void bill() {
		int cost = 0;
		int totalWater = 0;
		int totalGuests = guests.stream().mapToInt(a->a).sum();
		//find the cost for apartments 
		ApartMent apartMent;
		if (apartmentType == ApartmentType.TWO_BHK) {
		    apartMent = new TwoBhkApartment(totalGuests);
			cost = apartMent.calculateCost(apartMent.calculateTotalWater(), ratio);
			totalWater = apartMent.calculateTotalWater();
		}
		if (apartmentType == ApartmentType.THREE_BHK) {
			apartMent = new ThreeBhkApartment(totalGuests);
			cost = apartMent.calculateCost(apartMent.calculateTotalWater(), ratio);
			totalWater += apartMent.calculateTotalWater();
		}
		
		//add guests for totalWater
		totalWater += WaterBillUtils.calculateMonthlyWater(totalGuests);
		
		System.out.println(totalWater + " " + cost);
		
		
		
	}

}
