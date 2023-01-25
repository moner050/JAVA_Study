package programmers.lv2;

import java.util.HashMap;

// 위장
// https://school.programmers.co.kr/learn/courses/30/lessons/42578
public class Camouflage_42578 {
    public static void main(String[] args) {
//        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int result = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String[] clothe : clothes) {
            if(hashMap.containsKey(clothe[1])) {
                hashMap.put(clothe[1], hashMap.get(clothe[1]) + 1);
                continue;
            }
            hashMap.put(clothe[1], 1);
        }

        for (int cnt : hashMap.values()) {
            result *= cnt + 1;
        }

        return result - 1;
    }
}
