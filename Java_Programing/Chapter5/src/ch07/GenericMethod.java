package ch07;

public class GenericMethod {

	public static<T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2)
	{
		// 좌,우,상,하 값 가져오기
		double left = ((Number)p1.getX()).doubleValue();
		double right =((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		// 너비 구하기
		double width = right - left;
		// 높이 구하기
		double height = bottom - top;
		
		// 면적 리턴.
		return width * height;

	}
	
	
	public static void main(String[] args)
	{
		// Point의 x는 정수형, y는 실수형으로 넣어줌.
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(10, 10.0);
		
		// 실수형 변수 size에 사각형의 면적을 구해 값 넣기.
		double size = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println(size);
		
	}
}
