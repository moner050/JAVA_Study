package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̼���");
		
		// static������ �ν��Ͻ��� �������� �ʰ� Ŭ���� �̸����� ������ ��� �����ϴ�.
//		System.out.println(Employee.getSerialNum());
		System.out.println(employeeLee.getSerialNum());
		
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
		
		
		System.out.println(employeeLee.getEmployeeName() + "���� �����" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "���� �����" + employeeKim.getEmployeeId());
	}

}
