package member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

import member.dao.MemberDao;

public class MemberRegister {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	MemberDao memberDao = new MemberDao();
	
	public void registerCheck(String member_id) throws IOException
	{
		// 공백이 입력되었다면 오류문 출력
		if(member_id.equals(""))
		{
			System.out.println("아이디는 필수 입력항목입니다");
			return;
		}
		
		// M- 으로 시작하지 않거나, 문자의 길이가 7글자가 아닐 경우 오류문 출력
		if(!(member_id.startsWith("M-")) || member_id.length() != 7)
		{
			System.out.println("아이디는 'M-'로 시작해야 하며, M-를 포함하여 7개의 문자로 구성해야 합니다.");
			return;
		}
		
		// 만약 똑같은 DB 내에 똑같은 이름이 없으면
		if(!(memberDao.equalMember(member_id)))
		{
			// 이름을 입력받고
			System.out.print("이름을 입력하세요 : ");
			String name = br.readLine();
			// 입력받은 이름의 값이 공백이면 오류문 출력
			if(name.equals(""))
			{
				System.out.println("이름은 필수 입력항목입니다.");
				return;
			}
			else
			{	// 입력된 값이 공백이 아니면 전화번호 입력받기
				System.out.print("전화번호를 입력하세요 : ");
				String phone_number = br.readLine();
				// 정규표현식을 사용하여 입력받은 전화번호가 올바른 형식인지 확인
				boolean number_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", phone_number);
				
				// 만약 입력받은 전화번호가 공백이면 오류문 출력
				if(phone_number.equals(""))
				{
					System.out.println("전화번호는 필수 입력항목입니다.");
					return;
				}// 만약 전화번호가 올바른 형식이 아니거나, 13글자가 아닐 경우 오류문 출력
				else if(!number_check || phone_number.length() != 13)
				{
					System.out.println("전화번호는 두 개의 '-'를 포함하여 총 13개의 문자로 구성해야 합니다.");
					return;
				}
				else // 다 정상적이면 회원 등록과정 진행하기
				{
					if(memberDao.insertMember(member_id, name, phone_number))
					{
						System.out.println("---> 회원가입에 성공하셨습니다.");
					}
					else System.out.println("---> 회원가입에 실패하셨습니다.");
				}
			}
		}
		else
		{
			System.out.println(member_id + "가 이미 존재합니다.");
		}
	}
	
}
