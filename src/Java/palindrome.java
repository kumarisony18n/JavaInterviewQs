package Java;

public class palindrome {

	public static void main(String[] args) {
		String str = "radar";
		String rev = "";
		if(str.length()!= 0 && str!=null) {
			
			for(int i=str.length()-1;i>=0;i--) {
				rev = rev+ str.charAt(i);
			
			}
			System.out.println(rev);
			if(str.equals(rev)) {
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not a palindrome");
			}
		}

	}

}
