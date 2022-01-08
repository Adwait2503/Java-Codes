package map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Polo");
		hashMap.put(2, "Carrera");
		hashMap.put(3, "Gt 40");
		hashMap.put(4, "Figo");
		hashMap.put(4, "Evo");
		Set<Integer> keySet = hashMap.keySet();
		for (Integer inte : keySet) {
			System.out.println("Keys :" + inte + ", Values :" + hashMap.get(inte));
		}
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for (Entry<Integer, String> s : entrySet) {
			System.out.println(s);
		}
	}

}
