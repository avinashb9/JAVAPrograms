package collectionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		Collections.addAll(list,"B","C","D","A","C","F","C");
		Set<List<String>> setInt = Collections.singleton(list);
		System.out.println(list);
		list.remove("B");
		System.out.println(list);
		list.removeAll(Collections.singleton("C"));
		//removeAll takes collection as an input.
		//So, dynamic collection needs to be created with C String alone
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
