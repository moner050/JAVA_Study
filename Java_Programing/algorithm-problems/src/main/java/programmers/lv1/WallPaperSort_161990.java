package programmers.lv1;

import java.util.Arrays;

// 바탕화면 정리
// https://school.programmers.co.kr/learn/courses/30/lessons/161990
public class WallPaperSort_161990 {

    public static void main(String[] args) {
//        String[] wallpaper = {
//                ".#...",
//                "..#..",
//                "...#."
//        };

//        String[] wallpaper = {
//                "..........",
//                ".....#....",
//                "......##..",
//                "...##.....",
//                "....#....."
//        };

        String[] wallpaper = {
                ".##...##.",
                "#..#.#..#",
                "#...#...#",
                ".#.....#.",
                "..#...#..",
                "...#.#...",
                "....#...."
        };

        System.out.println(Arrays.toString(solution(wallpaper)));
    }

    public static int[] solution(String[] wallpaper) {
        int minX = wallpaper.length, minY = wallpaper[0].length(), maxX = 0, maxY = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            String[] temp = wallpaper[i].split("");
            for (int j = 0; j < temp.length; j++) {
                if(temp[j].equals("#")) {
                    minX = Math.min(i, minX);
                    minY = Math.min(j, minY);
                    maxX = Math.max(i, maxX);
                    maxY = Math.max(j, maxY);
                }
            }
        }
        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }
}
