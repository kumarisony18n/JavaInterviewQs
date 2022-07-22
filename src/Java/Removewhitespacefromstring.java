package Java;

public class Removewhitespacefromstring {

	public static void main(String[] args) {
		String str = "Hi and Hello World";
		String s = str.replaceAll(" ","");
		System.out.println(s);
		/*String s = "";
		char[] ch = str.toCharArray();
		int length = ch.length;
		for(int i=0;i<length;i++) {
			
			if(ch[i]!= ' ') {
				
				s = s + ch[i];
			}
			
		}*/
		System.out.println(s);
	}

}
