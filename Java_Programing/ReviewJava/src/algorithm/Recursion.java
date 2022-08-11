package algorithm;

import java.util.ArrayList;

public class Recursion {


    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        Recursion recursion = new Recursion();
        // 곱셈
        System.out.println(recursion.FactorialMultiply(5));
        // 더하기
        System.out.println(recursion.FactorialSum(5));
        // List 더하기
        for (int i = 1; i <= 10; i++) {
            myList.add(i);
        }
        System.out.println(recursion.FactorialListSum(myList));
    }

    public int FactorialMultiply(int num){
        if(num <= 1) return num;
        return num * this.FactorialMultiply(num - 1);
    }

    public int FactorialSum(int num){
        if(num <= 1) return num;
        return num + this.FactorialSum(num - 1);
    }

    public int FactorialListSum(ArrayList<Integer> dataList){
        if(dataList.size() <= 0) return 0;
        return dataList.get(0) + this.FactorialListSum(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
    }
}
