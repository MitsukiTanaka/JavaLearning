package chapter3;

import java.io.*;

/**
 * Q3-3 ユーザが入力した文字列の各文字の文字コードを表示する
 */
public class Unicode {
    public static void main(String[] args) {
        System.out.println("文字列を入力してください");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            char c;
            c = line.charAt(0);
            System.out.println("'" + c + "'の文字コードは" + (int) c + "です");

            c = line.charAt(1);
            System.out.println("'" + c + "'の文字コードは" + (int) c + "です");

            c = line.charAt(2);
            System.out.println("'" + c + "'の文字コードは" + (int) c + "です");

            c = line.charAt(3);
            System.out.println("'" + c + "'の文字コードは" + (int) c + "です");

            c = line.charAt(4);
            System.out.println("'" + c + "'の文字コードは" + (int) c + "です");

            c = line.charAt(5);
            System.out.println("'" + c + "'の文字コードは" + (int) c + "です");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
