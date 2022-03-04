package factory.pattern;

public class ProfessionFactory {

	Profession getObject(String s){
		
		if(s.equalsIgnoreCase("doctor")){
			return new Doctor();
		}
		if(s.equalsIgnoreCase("engineer")){
			return new Engineer();
		}
		if(s.equalsIgnoreCase("lawyer")){
			return new Lawyer();
		}
		return null;
	}
	
}
