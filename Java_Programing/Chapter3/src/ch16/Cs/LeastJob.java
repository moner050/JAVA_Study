package ch16.Cs;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��Ⱑ ���� ������ �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("��Ⱑ ���� �������� ����մϴ�.");
	}

}
