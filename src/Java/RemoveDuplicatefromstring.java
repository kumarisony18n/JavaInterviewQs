package Java;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatefromstring {

	public static void main(String[] args) {
		
		 char str[] = "geeksforgeeks".toCharArray();
		 int len = str.length;
		 removeDuplicates(str,len);

	}
	public static void removeDuplicates(char str[],int len) {
		
		HashSet<Character> s = new LinkedHashSet<>(len-1);
		for(char sc: str) {
			s.add(sc);
		}
		System.out.println(s);
	}

}
