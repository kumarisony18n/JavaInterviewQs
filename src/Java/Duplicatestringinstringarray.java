package Java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicatestringinstringarray {

	public static void main(String[] args) {
		String infra[] = {"Amazon", "Azure", "GCP", "Saucelabs", "Amazon", "Azure","GCP","Ali Baba"};
		
		//Brutforce
		System.out.println("******bruteforce**********");
		
		for(int i = 0; i<infra.length;i++) {
			for(int j= i+1; j<infra.length;j++) {
				if(infra[i].equals(infra[j]))
				{
					System.out.println(infra[i]);
				}
				
			}
		}
		
		//Hashset
		System.out.println("*******HashSet*******");
		
		Set<String> data = new HashSet<String>();
		
		for(String e :infra){
			if(data.add(e)==false){
				System.out.println(e);
			}
		}
		
		//HashMap
		System.out.println("***********HashMap*******");
		Map<String,Integer> datamap = new HashMap<String,Integer>();
		for(String e: infra) {
			if(datamap.containsKey(e)) {
			datamap.put(e, datamap.get(e)+1);
		}
			else {
				datamap.put(e, 1);
			}
		
	}
		for(Map.Entry entry : datamap.entrySet()){
			String key = (String)entry.getKey();
			int value = (int)entry.getValue();
			if(value>1) {
				System.out.println(key +",  value:"+value);
			}
		}
	}
}
