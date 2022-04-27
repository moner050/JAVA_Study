package ch09;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        List<Integer> scoreList = new ArrayList<Integer>(3);
        System.out.println("객체의 수(1) : " + scoreList.size());

        scoreList.add(Integer.valueOf(83));
        scoreList.add(Integer.valueOf(68));
        scoreList.add(Integer.valueOf(92));
        scoreList.add(Integer.valueOf(100));
        System.out.println("객체의 수(2) : " + scoreList.size());

        System.out.println("1번 인덱스에 저장된 객체 : " + scoreList.get(1));

        System.out.println("68 객체 삭제 전 : " + scoreList.contains(Integer.valueOf(68)));

        scoreList.remove(1);

        System.out.println("68 객체 삭제 후 : " + scoreList.contains(Integer.valueOf(68)));

        System.out.println("객체 삭제 후, 객체의 수(3) : " + scoreList.size());

        System.out.println("1번 인덱스에 저장된 객체 : " + scoreList.get(1));
    }
}
