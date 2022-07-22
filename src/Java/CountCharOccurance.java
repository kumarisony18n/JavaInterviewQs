package Java;

import java.util.HashMap;
import java.util.Map;

public class CountCharOccurance {
	
	public static void count(String str) {
	
		
		char[] strArray = str.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char c:strArray) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}

	}
	

	public static void main(String[] args) {
		String str = "Javajj";
		count(str);
	}
}
		
		
