package effectiveJava.item2.builderPattern;

public class MainBuilder {

  public static void main(String[] args) {

    // 필수 매개변수만 받아 인스턴스 생성하기
    Member jung = new Member.Builder("test1234", "정재원", "test5678", 20)
        .build();

    System.out.println(jung.toString());

    // 선택 매개변수까지 받아 인스턴스 생성하기
    Member lee = new Member.Builder("addmore1234", "lee", "add1234", 34)
        .gender("male")
        .address("서울특별시 관악구 난우길 4")
        .job("개발자")
        .build();

    System.out.println(lee.toString());

    // 롬복 빌더 어노테이션을 이용해 인스턴스 생성하기
    LombokMember kim = LombokMember.builder()
        .id("kimMaeMi")
        .name("매미킴")
        .password("kmm1234")
        .age(17)
        .gender("male")
        .address("서울역")
        .job("개그맨")
        .build();

    System.out.println(kim.toString());

  }
}
