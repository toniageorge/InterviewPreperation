package designPattern.AbstractFactory;

public abstract class Plan {

	public int rate;
	
	public abstract void getRate();
	
	public double calculateBil(double units){		
		return rate * units;
				
	}

	
}
