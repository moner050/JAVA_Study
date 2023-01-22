package programmers.lv2;

import java.util.ArrayDeque;
import java.util.Deque;

// 캐시
// https://school.programmers.co.kr/learn/courses/30/lessons/17680
public class Cache_17680 {
    public static void main(String[] args) {
//        int cacheSize = 3;
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int cacheSize = 3;
        String[] cities = {"a", "b", "c", "a", "b", "d", "c"};

        System.out.println(solution(cacheSize, cities));
    }

    public static int solution(int cacheSize, String[] cities) {
        int result = 0;
        Deque<String> cache = new ArrayDeque<>();

        if(cacheSize == 0) return cities.length * 5;

        for(String text : cities) {
            text = text.toLowerCase();
            if(cache.contains(text)) {
                cache.remove(text);
                cache.offer(text);
                result += 1;
            }
            else {
                if(cache.size() >= cacheSize) {
                    cache.pollFirst();
                }
                cache.offer(text);
                result += 5;
            }
        }

        return result;
    }
}
