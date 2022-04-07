package ch02;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("World");
        list.add("Good");

        System.out.println(list);

        list.remove(1);

        System.out.println(list);

    }


}
