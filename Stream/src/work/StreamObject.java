package work;

import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {

		//1- Blank
		Stream<Object> emptyStream = Stream.empty();
		
		//2- array,object,collection
		String names[]= {"Sushant","Prabodh","Rohit","Archit"};
		
		Stream<String> stream1 = Stream.of(names);
		
		stream1.forEach(e ->{
			System.out.println(e);
		});

		//3
		Stream<Object> streamBuilder = Stream.builder().build();
	}

}
