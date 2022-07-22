package Java;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		 ArrayList al = new ArrayList();
		 
		 for(int i = 1; i<=10; i++) {
			 al.add(i);
		 }
		 System.out.println(al);
		 
		 Iterator iter = al.iterator();
		 
		 while(iter.hasNext()) {
			 System.out.println(iter.next());
		 }
		 
	}

}
