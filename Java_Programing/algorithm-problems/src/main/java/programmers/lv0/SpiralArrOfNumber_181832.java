package programmers.lv0;

import java.util.Arrays;

// 정수를 나선형으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181832
public class SpiralArrOfNumber_181832 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.deepToString(solution(n)));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            answer[0][i] = i + 1;
        }

        int cnt = n + 1, chk = 1, turn = 0, check = n - 2, stack = 0;
        int xIdx = 1, yIdx = n - 1;

        while(cnt < (n * n) + 1) {
            if(chk == 1) {
                answer[xIdx][yIdx] = cnt++;
                turn++;
                if(turn > check) {
                    turn = 0;
                    chk++;
                    stack++;
                    yIdx--;
                }
                else xIdx++;

                if(stack == 2) {
                    stack = 0;
                    check--;
                }
            }
            else if(chk == 2) {
                answer[xIdx][yIdx] = cnt++;
                turn++;
                if(turn > check) {
                    turn = 0;
                    chk++;
                    stack++;
                    xIdx--;
                }
                else yIdx--;

                if(stack == 2) {
                    stack = 0;
                    check--;
                }
            }
            else if(chk == 3) {
                answer[xIdx][yIdx] = cnt++;
                turn++;
                if(turn > check) {
                    turn = 0;
                    chk++;
                    stack++;
                    yIdx++;
                }
                else xIdx--;

                if(stack == 2) {
                    stack = 0;
                    check--;
                }
            }
            else if(chk == 4) {
                answer[xIdx][yIdx] = cnt++;
                turn++;
                if(turn > check) {
                    turn = 0;
                    chk = 1;
                    stack++;
                    xIdx++;
                }
                else yIdx++;

                if(stack == 2) {
                    stack = 0;
                    check--;
                }
            }
        }

        return answer;
    }
}
