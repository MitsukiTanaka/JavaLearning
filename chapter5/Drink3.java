package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
            if (c == '1' || c == 'a') {
                System.out.println("オレンジジュースです");
            } else if (c == '2' || c == 'b') {
                System.out.println("コーヒーです");
            } else {
                System.out.println("どちらでもありません");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}
