package chapter5;

import java.io.*;

/**
 * Q5-6 if文をswitch文に変更
 * <pre>{@code
 * if (line.equals("あ")) {
 *     System.out.println("オレンジジュースです");
 * } else if (line.equals("い")) {
 *     System.out.println("コーヒーです");
 * } else {
 *     System.out.println("どちらでもありません");
 * }
 * }</>
 */
public class DrinkIf {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか");
            System.out.println("あ＝オレンジジュース");
            System.out.println("い＝コーヒー");
            System.out.println("う＝どちらでもない");
            System.out.println("あ、い、うのどれかを選んでください");
            String line = reader.readLine();
            switch (line) {
                case "あ":
                    System.out.println("オレンジジュースです");
                    break;
                case "い":
                    System.out.println("コーヒーです");
                    break;
                default:
                    System.out.println("どちらでもありません");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
