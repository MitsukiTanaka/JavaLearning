package chapter7;

import java.io.*;

/**
 * Q7-4 下記は何をするプログラムか。<br>
 * また、Continue文を使わない形式に書き換える。<br>
 * <pre>{@code
 *     public class ContinueTest {
 *     public static void main(String[] args) {
 *         BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
 *         try {
 *             String line;
 *             while ((line = reader.readLine()) !=null) {
 *                 if (!line.endsWith("{") && !line.endsWith("}")) {
 *                     continue;
 *                 }
 *                 System.out.print(line);
 *             }
 *         } catch (IOException e) {
 *             System.out.println(e);
 *         }
 *     }
 * }
 * }</pre>
 */
public class ContinueTest2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("{") || line.endsWith("}")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
/**
 * 入力した文字列の末尾に "{" もしくは "}" がある場合、出力されるプログラム
 */
