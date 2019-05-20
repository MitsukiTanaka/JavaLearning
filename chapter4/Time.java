package chapter4;

import java.io.*;

/**
 * Q4-3 現在の時刻を入力すると、それぞれに対する答えが表示されるプログラム
 */
public class Time {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("現在の時刻を入力してください（「時」だけでよい）");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            if (0 <= n && n <= 23) {
                System.out.println("現在は" + n + "時です");
            }
            if (0 <= n && n <= 11) {
                System.out.println("おはようございます");
            } else if (n == 12) {
                System.out.println("お昼です");
            } else if (13 <= n && n <= 18) {
                System.out.println("こんにちは");
            } else if (19 <= n && n <= 23) {
                System.out.println("こんばんは");
            } else {
                System.out.println("時刻の範囲を超えています");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません");
        }
    }
}
