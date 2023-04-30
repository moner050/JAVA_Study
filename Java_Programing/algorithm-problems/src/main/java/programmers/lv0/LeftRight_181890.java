package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 왼쪽 오른쪽
// https://school.programmers.co.kr/learn/courses/30/lessons/181890
public class LeftRight_181890 {
    public static void main(String[] args) {
//        String[] str_list = {"u", "u", "l", "r"};
        String[] str_list = {"u", "u", "r", "l", "u"};
//        String[] str_list = {"l"};

        System.out.println(Arrays.toString(solution(str_list)));
    }

    public static String[] solution(String[] str_list) {
        List<String> result = new ArrayList<>();
        boolean leftFlag = false, rightFlag = false;
        int idx = -1;

        for (int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                idx = i;
                leftFlag = true;
                break;
            }
            else if(str_list[i].equals("r")) {
                idx = i;
                rightFlag = true;
                break;
            }
        }

        if(idx == -1) return new String[]{};

        if(leftFlag) {
            if(idx == 0) return new String[]{};
            else result.addAll(Arrays.asList(str_list).subList(0, idx));
        }
        else if(rightFlag) {
            if(idx == str_list.length - 1) return new String[]{};
            else result.addAll(Arrays.asList(str_list).subList(idx + 1, str_list.length));
        }

        return result.toArray(String[]::new);
    }
}
