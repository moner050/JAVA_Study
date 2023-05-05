package programmers.lv1;

import java.util.Arrays;

// 공원 산책
// https://school.programmers.co.kr/learn/courses/30/lessons/172928
public class WalkingPark_172928 {
    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"}, routes = {"E 2","S 2","W 1"};
//        String[] park = {"SOO","OXX","OOO"}, routes = {"E 2","S 2","W 1"};
//        String[] park = {"OSO","OOO","OXO","OOO"}, routes = {"E 2","S 3","W 1"};

        System.out.println(Arrays.toString(solution(park, routes)));
    }

    public static int[] solution(String[] park, String[] routes) {
        int xIdx = 0, yIdx = 0;
        String[][] parks = new String[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            String[] temp = park[i].split("");
            for (int j = 0; j < park[i].length(); j++) {
                parks[i][j] = temp[j];
                if(temp[j].equals("S")) {
                    xIdx = j;
                    yIdx = i;
                }
            }
        }

        for (String route : routes) {
            boolean check = true;
            String[] temp = route.split(" ");

            String direction = temp[0];
            int count = Integer.parseInt(temp[1]);

            if(direction.equals("N")) {
                if(yIdx - count < 0) continue;
                else {
                    for (int i = 1; i <= count; i++) {
                        if(parks[yIdx - i][xIdx].equals("X")) {
                            check = false;
                            break;
                        }
                    }
                    if(check) {
                        parks[yIdx][xIdx] = "O";
                        yIdx -= count;
                        parks[yIdx][xIdx] = "S";
                    }
                }
            }
            else if(direction.equals("S")) {
                if(yIdx + count > park.length - 1) continue;
                else {
                    for (int i = 1; i <= count; i++) {
                        if(parks[yIdx + i][xIdx].equals("X")) {
                            check = false;
                            break;
                        }
                    }
                    if(check) {
                        parks[yIdx][xIdx] = "O";
                        yIdx += count;
                        parks[yIdx][xIdx] = "S";
                    }
                }
            }
            else if(direction.equals("W")) {
                if(xIdx - count < 0) continue;
                else {
                    for (int i = 1; i <= count; i++) {
                        if(parks[yIdx][xIdx - i].equals("X")) {
                            check = false;
                            break;
                        }
                    }
                    if(check) {
                        parks[yIdx][xIdx] = "O";
                        xIdx -= count;
                        parks[yIdx][xIdx] = "S";
                    }
                }
            }
            else if(direction.equals("E")) {
                if(xIdx + count > park[0].length() - 1) continue;
                else {
                    for (int i = 1; i <= count; i++) {
                        if(parks[yIdx][xIdx + i].equals("X")) {
                            check = false;
                            break;
                        }
                    }
                    if(check) {
                        parks[yIdx][xIdx] = "O";
                        xIdx += count;
                        parks[yIdx][xIdx] = "S";
                    }
                }
            }
        }

        return new int[] {yIdx, xIdx};
    }
}
