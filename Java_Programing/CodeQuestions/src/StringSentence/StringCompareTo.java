package StringSentence;

public class StringCompareTo {

	public static void main(String[] args) {
		String str1 = "��";
		String str2 = "��";
		String str3 = "��";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// ����
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// ���
		
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0
		
	}

}
