package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {

		// MemberArrayList �� �ν��Ͻ� ����
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// Member �� �ν��Ͻ����� ����
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		// �ɹ� ����Ʈ�� ��� �ν��Ͻ��� ������� �־��ش�.
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		memberArrayList.addMember(memberHong);
		
		// �ɹ� ����Ʈ ��ü ���
		memberArrayList.showAllMember();
		// memberKim�� id�� �޾ƿͼ� ����Ʈ���� ����.
		memberArrayList.removeMember(memberKim.getMemberId());
		// �ɹ� ����Ʈ ��ü ���
		memberArrayList.showAllMember();
		
		
	}

}
