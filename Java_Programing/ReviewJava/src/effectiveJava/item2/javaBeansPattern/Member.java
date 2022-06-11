package effectiveJava.item2.javaBeansPattern;

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

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setJob(String job) {
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
