package ch13;

import java.util.Comparator;
import java.util.TreeSet;


class MyCompare implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2) {
		// 오름차순
//		return s1.compareTo(s2);
		// 내림차순
		return s1.compareTo(s2) * (-1);
		
	}
	
}


public class MemberTreeSetTest {

	public static void main(String[] args) {

		/*
		// MemberArrayList 의 인스턴스 생성
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		// Member 의 인스턴스들을 생성
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		// 맴버 리스트에 멤버 인스턴스를 순서대로 넣어준다.
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);
		

		memberTreeSet.showAllMember();
		 */
		
		// 비교방식을 추가해줘야한다. new MyCompare()
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set);
		
	}

}
