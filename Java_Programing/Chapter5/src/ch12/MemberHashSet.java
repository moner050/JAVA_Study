package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
//	기본생성자
	public MemberHashSet()
	{
		hashSet = new HashSet<>();
	}
	
	// 매개변수로 사이즈를 받아서 배열 크기 지정
	public MemberHashSet(int size)
	{
		hashSet = new HashSet<>(size);
	}

	// 리스트에 맴버 추가하기
	public void addMember(Member member)
	{
		hashSet.add(member);
	}
	
	// 리스트에 매개변수로 받은 맴버의 아이디가 있나 체크 후 삭제하기.
	public boolean removeMember(int memberId)
	{
		// 맴버를 순회하며 아이디가 같은것을 고르기.
		/*
		for(int i = 0; i < arrayList.size(); i++)
		{
			Member member = arrayList.get(i);
			
			int tempId = member.getMemberId();
			
			if( tempId == memberId)
			{
				arrayList.remove(i);
				return true;
			}
		}
		*/
		
		// Iterator 방식
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext())
		{
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if( tempId == memberId)
			{
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// 모든맴버 출력하기.
	public void showAllMember()
	{
		for( Member member : hashSet )
		{
			System.out.println(member);
		}
		System.out.println();
	}
}
