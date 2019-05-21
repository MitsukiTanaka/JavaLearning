package chapter5;

import java.io.*;

/**
 * Q5-5 switch文をif文で書き換える
 * <pre>{@code
 * switch (c) {
 * case '1':
 * case 'a':
 *     System.out.println("オレンジジュースです");
 *     break;
 * case '2':
 * case 'b':
 *     System.out.println("コーヒーです");
 *     break;
 * default:
 *     System.out.println("どちらでもありません");
 *     break;
 * }
 * }<pre/>
 */
public class Drink2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか");
            System.out.println("1 オレンジジュース(a)");
            System.out.println("2 コーヒー(b)");
            System.out.println("3 どちらでもない(c)");
            System.out.println("1,2,3のどれかを選んでください（a,b,cでも選べます）");
            String line = reader.readLine();
            char c = line.charAt(0);

            if (c == '1' || c == 'a') {
                System.out.println("オレンジジュースです");
            } else if (c == '2' || c == 'b') {
                System.out.println("コーヒーです");
            } else {
                System.out.println("どちらでもありません");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
