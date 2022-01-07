package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
//	�⺻������
	public MemberHashSet()
	{
		hashSet = new HashSet<>();
	}
	
	// �Ű������� ����� �޾Ƽ� �迭 ũ�� ����
	public MemberHashSet(int size)
	{
		hashSet = new HashSet<>(size);
	}

	// ����Ʈ�� �ɹ� �߰��ϱ�
	public void addMember(Member member)
	{
		hashSet.add(member);
	}
	
	// ����Ʈ�� �Ű������� ���� �ɹ��� ���̵� �ֳ� üũ �� �����ϱ�.
	public boolean removeMember(int memberId)
	{
		// �ɹ��� ��ȸ�ϸ� ���̵� �������� ����.
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
		
		// Iterator ���
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
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// ���ɹ� ����ϱ�.
	public void showAllMember()
	{
		for( Member member : hashSet )
		{
			System.out.println(member);
		}
		System.out.println();
	}
}
