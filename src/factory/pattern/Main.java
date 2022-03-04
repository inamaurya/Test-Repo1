package factory.pattern;

public class Main {

	public static void main(String[] args) {
		
		ProfessionFactory f = new ProfessionFactory();
		Profession pro = f.getObject("engineer");
		pro.print();
	}
}
