package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 할 일 목록
// https://school.programmers.co.kr/learn/courses/30/lessons/181885
public class TodoList_181885 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        System.out.println(Arrays.toString(solution(todo_list, finished)));
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if(!finished[i]) result.add(todo_list[i]);
        }

        return result.toArray(String[]::new);
    }
}
