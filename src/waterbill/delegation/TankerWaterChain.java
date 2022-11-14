package waterbill.delegation;

public interface TankerWaterChain {
	
	public void next(TankerWaterChain tankerWaterChain);
	public int process(int waterInLiter);

}
