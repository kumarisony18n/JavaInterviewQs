package Java;

import java.util.Arrays;

public class ComparetwoArrays {
	
	static Boolean compareArrays(Object[] a, Object[] b) {
		
		if(a.length!= b.length) {
			return false;
		}
		else {
			for(int i = 0; i<a.length;i++) {
				if(a[i]!= b[i]) {
					
				return false;
			}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,4};
		Integer[] arr2 = {1,2,8,4};
		
		if(compareArrays(arr1, arr2))
		{
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
		/*if(Arrays.equals(arr1, arr2)) {
			System.out.println("Arrays are equal");
		}
		else
		{
			
			System.out.println("Arrays are not equal");
				
		}*/
		
		
		
	}

}
