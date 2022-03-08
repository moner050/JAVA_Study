package ch13;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
//	�⺻������
	public MemberTreeSet()
	{
//		treeSet = new TreeSet<>();
//		comparator�� ������ �ݵ��
		treeSet = new TreeSet<Member>(new Member());
	}

	// ����Ʈ�� �ɹ� �߰��ϱ�
	public void addMember(Member member)
	{
		treeSet.add(member);
	}
	
	// ����Ʈ�� �Ű������� ���� �ɹ��� ���̵� �ֳ� üũ �� �����ϱ�.
	public boolean removeMember(int memberId)
	{
		// Iterator ���
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
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// ���ɹ� ����ϱ�.
	public void showAllMember()
	{
		for( Member member : treeSet )
		{
			System.out.println(member);
		}
		System.out.println();
	}
}