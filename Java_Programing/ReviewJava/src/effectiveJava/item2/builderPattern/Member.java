package effectiveJava.item2.builderPattern;

public class Member {

  // 필수 매개변수
  private String id;
  private String name;
  private String password;
  private int age;
  // 선택 매개변수
  private String gender;
  private String address;
  private String job;

  public static class Builder{

    // 필수 매개변수
    private String id;
    private String name;
    private String password;
    private int age = 0;
    // 선택 매개변수 -> 기본값으로 초기화
    private String gender = "";
    private String address = "";
    private String job = "";

    public Builder(String id, String name, String password, int age) {
      this.id = id;
      this.name = name;
      this.password = password;
      this.age = age;
    }

    public Builder gender(String gender){
      this.gender = gender;
      return this;
    }

    public Builder address(String address){
      this.address = address;
      return this;
    }

    public Builder job(String job){
      this.job = job;
      return this;
    }

    public Member build(){
      return new Member(this);
    }
  }

  private Member(Builder builder){
    id = builder.id;
    name = builder.name;
    password = builder.password;
    age = builder.age;
    gender = builder.gender;
    address = builder.address;
    job = builder.job;
  }

  // 값 출력을 위한 toString 오버라이드
  @Override
  public String toString() {
    return "Member{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", password='" + password + '\'' +
        ", age=" + age +
        ", gender='" + gender + '\'' +
        ", address='" + address + '\'' +
        ", job='" + job + '\'' +
        '}';
  }
}
