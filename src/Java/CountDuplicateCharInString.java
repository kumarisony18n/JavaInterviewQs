package Java;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharInString {
	
	public static void countDuplicate(String str) {
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		char[] strArray = str.toCharArray();
		for(char c: strArray) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		for(Map.Entry entry: hm.entrySet()) {
			char key = (char)entry.getKey();
			int value = (int)entry.getValue();
			if(value>1) {
				System.out.println(key+", count "+value);
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "aaabbbc";
		countDuplicate(str);

	}

}
