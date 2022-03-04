import java.util.Arrays;

public class CountAnagramString {

	static int countAnagram(String a, String p){
		int count = 0;
		int arr_p [] = new int[26];
		int arr_tem [] = new int[26];
		for(int i = 0; i<p.length(); i++){
			arr_p[p.charAt(i) - 'a']++;
		}
		for(int i = 0; i<p.length(); i++){
			arr_tem[a.charAt(i) - 'a']++;
		}
		if(Arrays.equals(arr_p, arr_tem)){
			count++;
		}
		
	    for(int i = p.length(), j = 0; i<a.length(); i++, j++){
	    	//remove the first char from array
			arr_tem[a.charAt(j) - 'a']--;
			// add next char
			arr_tem[a.charAt(i) - 'a']++;
			if(Arrays.equals(arr_p, arr_tem)){
				count++;
			}
		}
		
		
		
		return count;
	}
	public static void main(String[] args) {
		
		String a  = "ababd";
		String p = "ad";
		System.out.println(countAnagram(a,p));
	}
}
