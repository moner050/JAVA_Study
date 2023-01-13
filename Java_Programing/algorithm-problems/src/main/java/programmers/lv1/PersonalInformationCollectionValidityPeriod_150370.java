package programmers.lv1;

import java.util.*;

// 개인정보 수집 유효기간
// https://school.programmers.co.kr/learn/courses/30/lessons/150370
public class PersonalInformationCollectionValidityPeriod_150370 {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"}, privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
//        String today = "2020.01.01";
//        String[] terms = {"Z 3", "D 5"}, privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        String[] ymd = today.split("\\.");
        int year = Integer.parseInt(ymd[0]), month = Integer.parseInt(ymd[1]), day = Integer.parseInt(ymd[2]);

        Map<String, Integer> term = new HashMap<>();

        for (String t : terms) {
            String[] temp = t.split(" ");
            term.put(temp[0], Integer.parseInt(temp[1]));
        }

        for (int i = 1; i <= privacies.length; i++) {
            String[] temp = privacies[i - 1].split(" ");

            String[] thisYmd = temp[0].split("\\.");
            int thisYear = Integer.parseInt(thisYmd[0]), thisMonth = Integer.parseInt(thisYmd[1]) + term.get(temp[1]), thisDay = Integer.parseInt(thisYmd[2]);

            if(thisMonth > 12) {
                while(thisMonth > 12) {
                    thisMonth -= 12;
                    thisYear += 1;
                }
            }

            if(thisYear < year) result.add(i);
            else if(thisYear == year && thisMonth < month) result.add(i);
            else if(thisYear == year && thisMonth == month && thisDay < day) result.add(i);
            else if(thisYear == year && thisMonth == month && thisDay == day) result.add(i);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}
