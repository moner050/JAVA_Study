package effectiveJava.item5;

import java.util.function.Supplier;

class Member {
    protected String name;
    protected int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}


public class SupplierTest {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "서플라이";
        Supplier<Member> memberSupplier = () -> new Member("이름", 18);

        Member member = memberSupplier.get();

        System.out.println(supplier.get() + " " + member);

    }
}
