package effectiveJava.item1.getNameTest;

public class StaticStudent {
    private String name;
    private String id;

    public static StaticStudent Name(String name){
        StaticStudent staticStudent = new StaticStudent();
        staticStudent.name = name;
        return staticStudent;
    }

    public static StaticStudent id(String id){
        StaticStudent staticStudent = new StaticStudent();
        staticStudent.id = id;
        return staticStudent;
    }
}
