package baekjoon.lv9;

import java.io.*;

public class BJ_17478 {

    public static final String start = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
    public static String line = "____";
    public static final String firstSentence = "\"재귀함수가 뭔가요?\"\n";

    public static final String[] sentences = {"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",
                                                "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",
                                                "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n"};

    public static final String finalSentence = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";

    public static final String end = "라고 답변하였지.\n";
    public static String temp = "";
    public static String recursiveTap = "";
    public static String lastSentence = "";

    public static String whatIsRecursive(int n)
    {
        String tap = recursiveTap;

        // 마지막 문장을 담는 문자열
        for (int i = 0; i < n; i++)
        {
            lastSentence += line;
        }
        lastSentence += end;

        if(n == 0)
        {
            temp += tap + firstSentence;
            temp += tap + finalSentence;
            return temp + lastSentence;
        }
        temp += tap + firstSentence;
        temp += tap + sentences[0];
        temp += tap + sentences[1];
        temp += tap + sentences[2];

        // 재귀에 들어가기 전 ____ 를 늘려준다.
        recursiveTap += line;
        return whatIsRecursive(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(start + "");
        bw.write(whatIsRecursive(N) + "");
        bw.close();
    }
}
