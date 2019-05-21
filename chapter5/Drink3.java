package chapter5;

import java.io.*;

/**
 * Q5-8 エラーを防ぐ
 */
public class Drink3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか");
            System.out.println("1 オレンジジュース(a)");
            System.out.println("2 コーヒー(b)");
            System.out.println("3 どちらでもない");
            System.out.println("1,2,3のどれかを選んでください（a,b,cでも選べます）");
            String line = reader.readLine();
            char c;
            if (line.length() > 0) {
                c = line.charAt(0);
            } else {
                c = 'c';
            }
            switch (c) {
                case 'a':
                    System.out.println("オレンジジュースです。");
                    break;
                case 'b':
                    System.out.println("コーヒーです。");
                    break;
                default:
                    System.out.println("どちらでもありません。");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
