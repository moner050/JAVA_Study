package effectiveJava.item1.returnLow;

public class HangangSchool implements School{

    private String name;

    public HangangSchool(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println( this.name + "초등학교입니다.");
    }

}
