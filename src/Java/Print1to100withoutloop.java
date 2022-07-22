package Java;

public class Print1to100withoutloop {

	public static void main(String[] args) {
		printNum(1);

	}
	
	public static void printNum(int number)
	{
		if(number<=100) {
			number++;
			System.out.println(number);
			printNum(number);
		}
		
	}

}
