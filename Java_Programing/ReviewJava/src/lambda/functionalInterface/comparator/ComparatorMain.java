package lambda.functionalInterface.comparator;

import lambda.functionalInterface.comparator.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 같은 타입의 매개변수 두개를 받아 int 를 반환하는 Comparator 함수 실습
public class ComparatorMain {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(3, "Eric"));
        users.add(new User(1, "Charlie"));
        users.add(new User(2, "Bob"));
        System.out.println(users);

        // User1 의 아이디가 작으면 User1 을 더 앞으로 가게 정렬해주는 Comparator
        Comparator<User> idComparator = (u1, u2) -> u1.getId() - u2.getId();

        Collections.sort(users, idComparator);
        System.out.println(users);

        // 이름순으로 정렬해주는 Comparator
        Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
        System.out.println(users);
    }

}
