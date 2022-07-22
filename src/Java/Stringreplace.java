package Java;

public class Stringreplace {

	public static void main(String[] args) {
		String str = "test1234";
		//replace part of string with empty string that is not alphabets a-z
		String s = str.replaceAll("[^a-z]", "");
		System.out.println(s);
		
		//replace part of string with empty string that is not digits from 0-9
		String[] stt = str.split("[0-9]");
		System.out.println(stt.length);
		for(String sttt: stt) {
			System.out.println(sttt);
		}
		String number = str.replaceAll("[^0-9]", "");
		System.out.println(number);
	}

}
