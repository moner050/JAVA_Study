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
	
		// sorted�� ������ �ڷḦ �ٲ����� �ʴ´�.
		sList.stream().sorted().forEach(s->System.out.print(s + "\t"));
		System.out.println();
		// �׷��� ���ڿ��� ���̸� ����Ҷ��� ���� ���� sList�� �ִ� ���� ������ ������� ���´�.
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n + "\t"));
		System.out.println();
		// �迭���� ���ڿ��� ���̰� 5�̻��� �͵鸸 ���
		sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.print(s + "\t"));
	}

}
