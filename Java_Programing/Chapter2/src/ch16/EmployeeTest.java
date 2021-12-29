package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		// static변수는 인스턴스를 생성하지 않고도 클래스 이름으로 참조해 출력 가능하다.
//		System.out.println(Employee.getSerialNum());
		System.out.println(employeeLee.getSerialNum());
		
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은" + employeeKim.getEmployeeId());
	}

}
