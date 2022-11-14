package waterbill.apartment;

public interface ApartMent {

	public int calculateTotalWater();

	int calculateCost(int totalWater, String ratio);
}
