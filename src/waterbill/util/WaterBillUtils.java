package waterbill.util;

public class WaterBillUtils {
	
	public static int calculateMonthlyWater(int numberOfPeople) {
		return (numberOfPeople*10*30);
	}

	private static int[] getRatioParts(String ratio) {
		int[] parts = new int[2];
		
		String[] ratioParts = ratio.split(":");
		parts[0] = Integer.valueOf(ratioParts[0]);
		parts[1] = Integer.valueOf(ratioParts[1]);
		
		return parts;
	}
	
	public static int[] getWaterParts(int totalWater, String ratio) {
		int[] waterParts = new int[2];
		int[] ratioParts = getRatioParts(ratio);
		
		int corporationWater = Math.round(totalWater * ratioParts[0]/(ratioParts[0]+ratioParts[1]));
		int borewellWater = totalWater - corporationWater;
		
		waterParts[0] = corporationWater;
		waterParts[1] = borewellWater;
		
		return waterParts;
				
	}


}
