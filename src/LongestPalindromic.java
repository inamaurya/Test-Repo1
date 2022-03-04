import java.util.ArrayList;
import java.util.List;

public class LongestPalindromic {

	static ArrayList<Integer> list =  new ArrayList<>();
	
/*	public static String longestPalindromic(String s){
		
		if(s == null || s.length() < 1) return "";
		
		int start = 0;
		int end = 0;
		
		for(int i = 0; i<s.length() ; i++){
			
			int len1 = expnadFromMiddle(s, i, i);
			int len2  = expnadFromMiddle(s, i, i+1);
			int len = Math.max(len1, len2);
			if(len > end -start){
				start = i-((len-1)/2);
				end = i+(len/2);
			}
		}
		
		return s.substring(start, end+1);
		
	}*/
	
public static String longestPalindromic(String s){
		
		if(s == null || s.length() < 1) return "";
		
		int start = 0;
		int end = 0;
		int temp = 0;
		
		
		for(int i = 0; i<s.length() ; i++){
			
			int len1 = expnadFromMiddle(s, i, i);
			int len2 = expnadFromMiddle(s, i, i+1);
			if(len1 > 1)
			list.add(len1);
			if(len2 > 0)
				list.add(len2);
			if(temp < len1) temp =len1;
			
/*			int len2  = expnadFromMiddle(s, i, i+1);
			int len = Math.max(len1, len2);
			if(len > end -start){
				start = i-((len-1)/2);
				end = i+(len/2);
			}*/
		}
		
		return s.substring(start, end+1);
}
	public static  int expnadFromMiddle(String s, int left, int right){
		
		if(s == null || left> right) return 0;
		
		while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
			left--;
			right++;
		}
		return right-left-1;
	}
	
	public static void main(String[] args) {
		
		String s = "abrbacab";
		
		System.out.println(longestPalindromic(s));
		System.out.println(list.size());
	}
}




