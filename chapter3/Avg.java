package chapter3;

import java.io.*;

/**
 * Q3-2 2人の名前と年齢を入力し、その人たちの年齢の平均を表示
 */
public class Avg {
    public static void main(String[] args) {
        System.out.println("1人目：名前を入力してください");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name1 = reader.readLine();
            System.out.println(name1 + "さんこんにちは");
            System.out.println("年齢を入力してください");
            String tosi1 = reader.readLine();
            int age1 = Integer.parseInt(tosi1);

            System.out.println("2人目：名前を入力してください");
            String name2 = reader.readLine();
            System.out.println(name2 + "さんこんにちは");
            System.out.println("年齢を入力してください");
            String tosi2 = reader.readLine();
            int age2 = Integer.parseInt(tosi2);

            System.out.println(name1 + "さんと" + name2 + "さんの年齢の平均は" + (age1 + age2) / 2 + "歳です");

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("年齢が正しくありません");
        }
    }
}
