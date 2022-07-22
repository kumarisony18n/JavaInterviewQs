package Java;

public class SumofElementsinArray {

	public static void main(String[] args) {
		 int[] arr = {2,3,6,7};
		 int sum = 0;
		 int length = arr.length;
		 
		 for(int i = 0; i<=length-1; i++) {
			 sum+= arr[i];
			
		 }
		 System.out.println(sum);

	}

}
