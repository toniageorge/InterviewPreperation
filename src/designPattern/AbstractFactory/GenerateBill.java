package designPattern.AbstractFactory;

import java.util.HashMap;

public class GenerateBill {

	public static void main(String args[]){
		
		String planName = args[0];
		double units = Double.parseDouble(args[1]);
		
		PlanFactory pf = new PlanFactory();
		
		 Plan p =pf.getPlan(planName);
		 p.calculateBil(units);
		 
		 HashMap m = new HashMap();
		 m.put("t1", "t3");
	}
	
}
