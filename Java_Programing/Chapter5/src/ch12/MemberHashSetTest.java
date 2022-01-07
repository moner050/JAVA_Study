package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		// MemberHashSet 의 인스턴스 생성
		MemberHashSet memberHashSet = new MemberHashSet();
		
		// Member 의 인스턴스들을 생성
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		// memberHashSet에 멤버 인스턴스를 순서대로 넣어준다.
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		// 아이디가 중복되기때문에 들어가면 안됌.
		// Member에 중복체크를 하는것을 만들어줘야함.
		// 구현해주면 홍길동은 HashSet에 들어가지 않는다.
		Member memberHong = new Member (1003, "홍길동");
		
		
		// 맴버 리스트 전체 출력
		memberHashSet.showAllMember();
		// memberKim의 id를 받아와서 리스트에서 삭제.
		memberHashSet.removeMember(memberKim.getMemberId());
		// 맴버 리스트 전체 출력
		memberHashSet.showAllMember();
		
		
	}

}
