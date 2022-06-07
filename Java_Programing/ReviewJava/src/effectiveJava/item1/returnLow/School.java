package effectiveJava.item1.returnLow;

public interface School {
    // 학교 소개
    void print();
    // School 을 상속받는 하위타입 객체 리턴
    static School introduceSchool(String name){
        return new HangangSchool(name);
    }
}
