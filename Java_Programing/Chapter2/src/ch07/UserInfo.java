package ch07;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String PhoneNumber;
	
	public UserInfo() {}
	
	public UserInfo(String userId, String userPassword, String userName)
	{
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	public String showUserInfo()
	{
		return "������ ���̵��" + userId + "�̰�, ��ϵ� �̸���" + userName + "�Դϴ�.";
	}
	
}
