package ch16.Cs;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("대기가 적은 상담원을 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("대기가 적은 상담원에게 배분합니다.");
	}

}
