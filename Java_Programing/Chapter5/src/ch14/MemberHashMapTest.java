package ch14;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;


public class MemberHashMapTest {

	public static void main(String[] args) {


		// MemberHashMap 의 인스턴스 생성
		MemberHashMap memberHashMap = new MemberHashMap();
		
		// Member 의 인스턴스들을 생성
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		// memberHashMap에 멤버 인스턴스를 순서대로 넣어준다.
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		memberHashMap.addMember(memberHong);
		
		// HashMap에 넣어진 모든 맴버들을 출력한다.
		memberHashMap.showAllMember();

		// 기본 HashMap 출력 테스트.
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1001, "Kim");
		hashMap.put(1002, "Lee");
		hashMap.put(1003, "Park");
		hashMap.put(1004, "Hong");
		
		// key, value pair로 값이 나온다.
		System.out.println(hashMap);
		
	}

}
