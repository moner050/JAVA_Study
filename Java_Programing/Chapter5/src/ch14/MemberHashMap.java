package ch14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	// MemberHashMap�� ������
	public MemberHashMap()
	{
		hashMap = new HashMap<>();
	}
	
	// hashMap�� member�� key�� value�� �־���.
	public void addMember(Member member)
	{
		hashMap.put(member.getMemberId(), member);
	}
	
	// hashMap�� key���� �ֳ� �˻� �� ����.
	public boolean removeMember(int memberId)
	{
		// hashMap�� Ű���� memberId�� �ִ��� boolean���� ������
		if( hashMap.containsKey(memberId) )
		{
			hashMap.remove(memberId);
		}
		
		System.out.println("no Element");
		return false;
	}
	
	// �ɹ� ��ü ���(key����)
	public void showAllMember()
	{
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext())
		{
			int key = ir.next();
			Member member = hashMap.get(key);
			// toString�Ǽ� ����.
			System.out.println(member);
		}
	}
	
}
