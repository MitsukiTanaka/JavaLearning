package chapter3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Q3-3 ユーザが入力した文字列の各文字コードを表示する（for文を使う）
 */
public class Unicode2 {
    public static void main(String[] args) {
        System.out.println("文字を入力してください");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            int i;
            for (i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                System.out.println("'" + c + "'の文字コードは" + (int) c + "です");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
