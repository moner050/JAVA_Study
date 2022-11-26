package programmers.lv1;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/92334
public class ReportResult_92334 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        for (int i : solution(id_list, report, k)) {
            System.out.print(i + " ");
        }
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] result = new int[id_list.length];
        HashMap<String, HashSet<String>> reportInfo = new HashMap<>();
        HashMap<String, Integer> reportCount = new HashMap<>();
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));

        for (String s : reportSet) {
            String reporter = s.split(" ")[0];
            String reported = s.split(" ")[1];

            reportInfo.putIfAbsent(reporter, new HashSet<>(){{add(reported);}});
            reportInfo.get(reporter).add(reported);
            reportCount.put(reported, reportCount.getOrDefault(reported, 0) + 1);
        }

        for (String reported : reportCount.keySet()) {
            int reportCnt = reportCount.get(reported);
            if(reportCnt >= k) {
                for (int i = 0; i < id_list.length; i++) {
                    if(reportInfo.containsKey(id_list[i]) && reportInfo.get(id_list[i]).contains(reported)) {
                        result[i]++;
                    }
                }
            }
        }

        return result;
    }
}
