package member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import member.dao.MemberDao;

public class MemberManager {

	BufferedReader br = null;
	MemberDao memberDao = null;
	MemberRegister memberRegister = new MemberRegister();
	
	String menuList = "목록을 원하시면 1번을 입력하세요.\r\n"
					+ "등록을 원하시면 2번을 입력하세요.\r\n"
					+ "수정을 원하시면 3번을 입력하세요.\r\n"
					+ "삭제를 원하시면 4번을 입력하세요.\r\n"
					+ "종료를 원하시면 0번을 입력하세요.";
	
	public MemberManager()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		memberDao = new MemberDao();
	}

	public void readMenu() throws NumberFormatException, IOException
	{
		while(true)
		{
			System.out.println(menuList);
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			else if(n == 1) memberDao.getMemberList();
			else if(n == 2)
			{
				System.out.print("아이디를 입력하세요 (형식 M-00001): ");
				String member_id = br.readLine();
				memberRegister.registerCheck(member_id);
			}
			else if(n == 3)
			{
				System.out.print("수정할 아이디를 입력하세요 (형식 M-00001): ");
				String member_id = br.readLine();
				if(!memberDao.equalMember(member_id))
				{
					System.out.println("일치하는 아이디가 없습니다.");
				}
				else
				{
					System.out.print("수정할 전화번호를 입력하세요 : ");
					String phone_number = br.readLine();
					if(memberDao.updateMember(phone_number, member_id))
					{
						System.out.println("---> 회원수정에 성공하셨습니다.");
					}
					else System.out.println("---> 회원수정에 실패하셨습니다.");
				}
			}
			else if(n == 4)
			{
				System.out.print("삭제할 아이디를 입력하세요 (형식 M-00001): ");
				String member_id = br.readLine();
				if(memberDao.equalMember(member_id))
				{
					if(memberDao.deleteMember(member_id))
					{
						System.out.println("---> " + member_id + "회원 삭제에 성공하셨습니다.");
					}
					else System.out.println("잘못 입력하셨습니다.");
				}
				else System.out.println("삭제할" + member_id + " 회원 정보가 존재하지 않습니다.");
			}
		}
	}

}
