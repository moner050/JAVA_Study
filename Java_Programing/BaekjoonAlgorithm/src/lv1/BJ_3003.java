package lv1;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int king = 1, queen = 1, look = 2, beShop = 2, night = 2, pawn = 8;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int myKing = Integer.parseInt(st.nextToken());
        int myQueen = Integer.parseInt(st.nextToken());
        int myLook = Integer.parseInt(st.nextToken());
        int myBeShop = Integer.parseInt(st.nextToken());
        int myNight = Integer.parseInt(st.nextToken());
        int myPawn = Integer.parseInt(st.nextToken());

        bw.write((king - myKing) + " ");
        bw.write((queen - myQueen) + " ");
        bw.write((look - myLook) + " ");
        bw.write((beShop - myBeShop) + " ");
        bw.write((night - myNight) + " ");
        bw.write((pawn - myPawn) + " ");

        br.close();
        bw.close();
    }
}
