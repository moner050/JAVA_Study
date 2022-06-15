package effectiveJava.item2.builderPattern;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class LombokMember {

    // 필수 매개변수
    private String id;
    private String name;
    private String password;
    private int age;
    // 선택 매개변수
    private String gender;
    private String address;
    private String job;

}
