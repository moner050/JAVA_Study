package effectiveJava.item1.returnParameter;

public class Human {


    public static Human doSomething(String behavior){
        if(behavior.equals("walk")) return new Walk();
        else if(behavior.equals("run")) return new Run();
        else if(behavior.equals("sleep")) return new Sleep();
        else return new Stand();
    }
}

class Walk extends Human {
}

class Run extends Human {
}

class Sleep extends Human {
}

class Stand extends Human {
}
