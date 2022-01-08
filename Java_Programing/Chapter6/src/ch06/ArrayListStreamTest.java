package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
	
		// sorted는 기존의 자료를 바꾸지는 않는다.
		sList.stream().sorted().forEach(s->System.out.print(s + "\t"));
		System.out.println();
		// 그래서 문자열의 길이를 출력할때의 값은 원래 sList에 있는 값의 길이의 순서대로 나온다.
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n + "\t"));
		System.out.println();
		// 배열에서 문자열의 길이가 5이상인 것들만 출력
		sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.print(s + "\t"));
	}

}
