package programmers.lv1;

// 키패드 누르기
// https://school.programmers.co.kr/learn/courses/30/lessons/67256
public class TypingKeypad_67256 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        System.out.println(solution(numbers, hand));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        Coordinate coordinate = new Coordinate(hand);

        for (int num : numbers) {
            sb.append(coordinate.move(num));
        }

        return sb.toString();
    }

    public static class Coordinate {
        private final int[][] keypad = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {-1, 0, -2}
        };

        private int left = -1;
        private int right = -2;
        private String hand;

        public Coordinate(String hand) {
            this.hand = hand;
        }

        private int[] getPosition(int number) {
            int[] pos = {0, 0};

            for (int i = 0; i < keypad.length; i++) {
                for (int j = 0; j < keypad[i].length; j++) {
                    if(keypad[i][j] == number) {
                        pos[0] = i;
                        pos[1] = j;
                        break;
                    }
                }
            }

            return pos;
        }

        private String move(int number) {
            int[] pos, left, right;
            pos = getPosition(number);
            left = getPosition(this.left);
            right = getPosition(this.right);

            if(number == 1 || number == 4 || number == 7) {
                this.left = keypad[pos[0]][pos[1]];
                return "L";
            }
            else if(number == 3 || number == 6 || number == 9) {
                this.right = keypad[pos[0]][pos[1]];
                return "R";
            }

            int leftPoint = Math.abs(left[0] - pos[0]) + Math.abs(left[1] - pos[1]);
            int rightPoint = Math.abs(right[0] - pos[0]) + Math.abs(right[1] - pos[1]);

            if(leftPoint > rightPoint) {
                this.right = keypad[pos[0]][pos[1]];
                return "R";
            }
            else if(leftPoint < rightPoint) {
                this.left = keypad[pos[0]][pos[1]];
                return "L";
            }
            else {
                if(this.hand.equals("right")) {
                    this.right = keypad[pos[0]][pos[1]];
                    return "R";
                }
                else {
                    this.left = keypad[pos[0]][pos[1]];
                    return "L";
                }
            }
        }
    }
}
