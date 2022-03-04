import java.util.HashSet;
import java.util.Set;

public class LongestSubStringwithUniqueChar {

	static int getMaxLen(String s){
		int len = 0;
		int i=0, j=0;
		Set<Character> set = new HashSet<>();
		
		while(i< s.length()){
			
			if(!set.contains(s.charAt(i))){
				
				set.add(s.charAt(i));
				i++;
				len = Math.max(set.size(), len);
			}
			else{
				set.remove(s.charAt(j));
				j++;
			}
		}
		
		
		return len;
	}
	public static void main(String[] args) {
		
		String s = "ADBCCD";
		System.out.println(getMaxLen(s));
	}
}
