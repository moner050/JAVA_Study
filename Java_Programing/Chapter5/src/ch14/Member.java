package ch14;

public class Member {

	private int memberId;
	private String memberName;
	
	// 생성자.
	public Member(int memberId, String memberName)
	{
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	// toString 메소드 오버로딩
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member)
		{
			Member member = (Member)obj;
			// 내가가진 맴버아이디와 지금 넘겨받은 멤버아이디가 같으면
			if( this.memberId == member.memberId )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
	
	
}
