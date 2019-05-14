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
            char c0 = line.charAt(0);
            int code0 = (int) c0;
            System.out.println("'" + c0 + "'の文字コードは" + (int) c0 + "です");

            char c1 = line.charAt(1);
            int code1 = (int) c1;
            System.out.println("'" + c1 + "'の文字コードは" + (int) c1 + "です");

            char c2 = line.charAt(2);
            int code2 = (int) c2;
            System.out.println("'" + c2 + "'の文字コードは" + (int) c2 + "です");

            char c3 = line.charAt(3);
            int code3 = (int) c3;
            System.out.println("'" + c3 + "'の文字コードは" + (int) c3 + "です");

            char c4 = line.charAt(4);
            int code4 = (int) c4;
            System.out.println("'" + c4 + "'の文字コードは" + (int) c4 + "です");

            char c5 = line.charAt(5);
            int code5 = (int) c5;
            System.out.println("'" + c5 + "'の文字コードは" + (int) c5 + "です");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
