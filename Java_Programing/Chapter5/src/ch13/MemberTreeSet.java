package ch13;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
//	기본생성자
	public MemberTreeSet()
	{
//		treeSet = new TreeSet<>();
//		comparator을 쓸때는 반드시
		treeSet = new TreeSet<Member>(new Member());
	}

	// 리스트에 맴버 추가하기
	public void addMember(Member member)
	{
		treeSet.add(member);
	}
	
	// 리스트에 매개변수로 받은 맴버의 아이디가 있나 체크 후 삭제하기.
	public boolean removeMember(int memberId)
	{
		// Iterator 방식
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext())
		{
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if( tempId == memberId)
			{
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// 모든맴버 출력하기.
	public void showAllMember()
	{
		for( Member member : treeSet )
		{
			System.out.println(member);
		}
		System.out.println();
	}
}
