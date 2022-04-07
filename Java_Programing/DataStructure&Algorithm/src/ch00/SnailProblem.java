package ch00;

public class SnailProblem {

	public static void main(String[] args) {

		// 달팽이가 하루에 3M를 올라가지만 잠잘때는 2M가 미끄러져 내려간다.
		// 달팽이가 10M 나무를 올라가는데 걸리는 일수를 구하시오.
		
		int day = 0, currentHeight = 0, treeHeight = 10, upHeight = 3, downHeight = 2;
		
		while(true)
		{
			day++;
			
			currentHeight += upHeight;
			
			if(currentHeight >= treeHeight) break;
			
			currentHeight -= downHeight;
		}
		
		System.out.println(day + "일 걸렸습니다.");
		
		
	}

}
