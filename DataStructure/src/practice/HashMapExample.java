package practice;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {

	public static void main(String[] args) {
		//hashmap creation
		HashMap<Integer, String> st = new HashMap<Integer, String>();
		
		//insertion of elements
		st.put(1, "Shraddha");
		st.put(2, "Shweta");
		st.put(3, "Vishaal");
		st.put(4, "Dnyanu");
		
		//printing the elements
		System.out.println(st);
		
		//searching elements by key 
		if(st.containsKey(5)) {
			System.out.println("Data Present");
		}
		else
			System.out.println("Data not present...");
		
		//searching elements by values
		System.out.println("Searched element is: "+st.get(1));
	
		
		for(Map.Entry<Integer, String> s :st.entrySet()) {
			System.out.println("Key is: "+s.getKey());
			System.out.println("Corresponding value is: "+s.getValue());
		}
	}
}

