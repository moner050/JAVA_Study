package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		// MemberHashSet �� �ν��Ͻ� ����
		MemberHashSet memberHashSet = new MemberHashSet();
		
		// Member �� �ν��Ͻ����� ����
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		// memberHashSet�� ��� �ν��Ͻ��� ������� �־��ش�.
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		// ���̵� �ߺ��Ǳ⶧���� ���� �ȉ�.
		// Member�� �ߺ�üũ�� �ϴ°��� ����������.
		// �������ָ� ȫ�浿�� HashSet�� ���� �ʴ´�.
		Member memberHong = new Member (1003, "ȫ�浿");
		
		
		// �ɹ� ����Ʈ ��ü ���
		memberHashSet.showAllMember();
		// memberKim�� id�� �޾ƿͼ� ����Ʈ���� ����.
		memberHashSet.removeMember(memberKim.getMemberId());
		// �ɹ� ����Ʈ ��ü ���
		memberHashSet.showAllMember();
		
		
	}

}
