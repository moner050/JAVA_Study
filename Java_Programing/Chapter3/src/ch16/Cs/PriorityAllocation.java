package ch16.Cs;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�켱������ ���� ���Դϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���õ��� ���� �������� ����մϴ�.");
	}

}
