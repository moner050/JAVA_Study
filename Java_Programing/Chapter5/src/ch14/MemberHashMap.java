package ch14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	// MemberHashMap의 생성자
	public MemberHashMap()
	{
		hashMap = new HashMap<>();
	}
	
	// hashMap에 member의 key와 value를 넣어줌.
	public void addMember(Member member)
	{
		hashMap.put(member.getMemberId(), member);
	}
	
	// hashMap에 key값이 있나 검사 후 삭제.
	public boolean removeMember(int memberId)
	{
		// hashMap의 키값에 memberId가 있는지 boolean으로 값받음
		if( hashMap.containsKey(memberId) )
		{
			hashMap.remove(memberId);
		}
		
		System.out.println("no Element");
		return false;
	}
	
	// 맴버 전체 출력(key값만)
	public void showAllMember()
	{
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext())
		{
			int key = ir.next();
			Member member = hashMap.get(key);
			// toString되서 나옴.
			System.out.println(member);
		}
	}
	
}
