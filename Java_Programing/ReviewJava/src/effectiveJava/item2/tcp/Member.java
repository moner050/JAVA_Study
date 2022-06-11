package effectiveJava.item2.tcp;

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

  public Member(String id, String name, String password, int age) {
    this(id, name, password, age, null, null, null);
  }

  public Member(String id, String name, String password, int age, String gender) {
    this(id, name, password, age, gender, null, null);
  }

  public Member(String id, String name, String password, int age, String gender,
      String address) {
    this(id, name, password, age, gender, address, null);
  }

  public Member(String id, String name, String password, int age, String gender,
      String address, String job) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.age = age;
    this.gender = gender;
    this.address = address;
    this.job = job;
  }

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
