package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
//	�⺻������
	public MemberArrayList()
	{
		arrayList = new ArrayList<>();
	}
	
	// �Ű������� ����� �޾Ƽ� �迭 ũ�� ����
	public MemberArrayList(int size)
	{
		arrayList = new ArrayList<>(size);
	}

	// ����Ʈ�� �ɹ� �߰��ϱ�
	public void addMember(Member member)
	{
		arrayList.add(member);
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
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext())
		{
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if( tempId == memberId)
			{
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// ���ɹ� ����ϱ�.
	public void showAllMember()
	{
		for( Member member : arrayList )
		{
			System.out.println(member);
		}
		System.out.println();
	}
}
