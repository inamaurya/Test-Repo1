import java.util.HashSet;
import java.util.Set;

public class CountNotUsedComputer {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	static int getCountnotusedComputer(String s, int computer){
		int count = 0;
		int occupied = 0;
		 char []seen = new char[26];
		
		Set<Character> set =  new HashSet();
		for(int i = 0; i< s.length(); i++){
			if(!set.contains(s.charAt(i)) && occupied <2){
				occupied++;
				set.add(s.charAt(i));
			}else if(set.contains(s.charAt(i))){
				set.remove(s.charAt(i));
				occupied--;
			}
			else{
				count++;
			}
		}
		return count/2;
		
/*		 for(int i = 0; i< s.length(); i++){
				if(seen[s.charAt(i)-'A'] == 0 && occupied <2){
					occupied++;
					seen[s.charAt(i)-'A'] = 1;
				}else if(seen[s.charAt(i)-'A'] == 1 && occupied <=2){
					seen[s.charAt(i)-'A'] = 0;
					occupied--;
				}
				else{
					count++;
				}
			}
			return count/2;
		*/
	}
	
	public static void main(String[] args) {
		
		String a  = "ABCDCDABFAPPAF";
		System.out.println(getCountnotusedComputer(a, 2));
		
		
	}
	
}
