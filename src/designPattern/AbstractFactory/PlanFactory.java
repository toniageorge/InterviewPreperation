package designPattern.AbstractFactory;

public class PlanFactory {

	public Plan getPlan( String name){
		
		if(name == null){
			
			return null;
		}
		if(name.equalsIgnoreCase("DOMESTIC")){
			
			return new DomesticPlan();
		}
		
		else if (name.equalsIgnoreCase("COMMERICIAL")){
			
			return new  CommercialPlan();
			
		}
		else if (name.equalsIgnoreCase("INSTITUTIONAL")){
			
			return new InstitutionalPlan();
			
		}
		
		return null;
	}
}
