package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {

		// MemberArrayList 의 인스턴스 생성
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// Member 의 인스턴스들을 생성
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		Member memberHong = new Member(1004, "홍길동");
		
		// 맴버 리스트에 멤버 인스턴스를 순서대로 넣어준다.
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		memberArrayList.addMember(memberHong);
		
		// 맴버 리스트 전체 출력
		memberArrayList.showAllMember();
		// memberKim의 id를 받아와서 리스트에서 삭제.
		memberArrayList.removeMember(memberKim.getMemberId());
		// 맴버 리스트 전체 출력
		memberArrayList.showAllMember();
		
		
	}

}
