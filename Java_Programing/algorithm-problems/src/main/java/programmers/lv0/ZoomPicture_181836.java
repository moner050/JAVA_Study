package programmers.lv0;

import java.util.Arrays;

// 그림 확대
// https://school.programmers.co.kr/learn/courses/30/lessons/181836
public class ZoomPicture_181836 {
    public static void main(String[] args) {
        String[] picture = {
                ".xx...xx.",
                "x..x.x..x",
                "x...x...x",
                ".x.....x.",
                "..x...x..",
                "...x.x...",
                "....x...."
        };
        int k = 2;

        System.out.println(Arrays.toString(solution(picture, k)));
    }

    public static String[] solution(String[] picture, int k) {
        String[] result = new String[picture.length * k];

        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (char c : picture[i].toCharArray()) {
                sb.append(String.valueOf(c).repeat(k));
            }

            for (int j = i * k; j < i * k + k; j++) {
                result[j] = sb.toString();
            }
        }

        return result;
    }
}
