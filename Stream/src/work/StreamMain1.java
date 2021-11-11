package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(50);
		list.add(21);
		list.add(22);
		list.add(67);

		
		// Without Using Stream
		List<Integer> listEven = new ArrayList<>();
		
		for(Integer i : list) {
			
			if(i%2==0) {
				listEven.add(i);
			}
		}
		
		System.out.println(list);
		System.out.println(listEven);
		
		// With Using Stream
		
//		Stream<Integer> stream = list.stream();
//		List<Integer>newList = stream.filter(i->i%2==0).collect(Collectors.toList());
//		
//		System.out.println(newList);
		
		List<Integer> newList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		
		List<Integer> newList1 = list.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(newList1);

	}

}
