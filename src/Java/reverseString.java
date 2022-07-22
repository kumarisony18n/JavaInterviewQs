package Java;

public class reverseString {

	public static void main(String[] args) {
		
		String s = "Hi and Hello";
		char[] arr = s.toCharArray();
		 int length = arr.length;
		 for(int i= length-1; i>=0; i--) {
			 System.out.println(arr[i]);
		 }
		/* StringBuilder str2 = new StringBuilder();
		 str2.append(s);
		 str2.reverse();
		 System.out.println(str2);*/

	}

}
