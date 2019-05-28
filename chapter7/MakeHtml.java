package chapter7;

import java.io.*;

/**
 * Q7-3<br>
 * ルール1（開始）：最初に一度だけ以下の6行を出力<br>
 * <pre>{@code
 * <!DOCTYPE html>
 * <html>
 * <head>
 * <title>My Page</title>
 * </head>
 * <body>
 *     }</pre>
 * ルール2（終了）：標準入力が終わったら、最後に以下の2行を出力<br>
 * <pre>{@code
 * </body>
 * </html>
 * }</pre>
 * ルール3（見出し1）：入力行が■で始まっていたら、■を取り除いた残りの文字列を"<h1>"と"</h1>"ではさみ改行付きで出力<br>
 * ルール4（見出し2）：入力行が●で始まっていたら、●を取り除いた残りの文字列を"<h2>"と"</h2>"ではさみ改行付きで出力<br>
 * ルール5（段落）：入力行がルール3にもルール4にも当てはまらない場合、入力行を"<p>"と"</p>"ではさみ改行付きで出力する
 */
public class MakeHtml {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            /* ルール1 */
            System.out.println("<!DOCTYPE html>");
            System.out.println("<html>");
            System.out.println("<head>");
            System.out.println("<title>My Page</title>");
            System.out.println("</head>");
            System.out.println("</html>");
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("■")) {
                    /* ルール3 */
                    System.out.println("<h1>" + line.substring(1) + "</h1>");
                } else if (line.startsWith("●")) {
                    /* ルール4 */
                    System.out.println("<h2>" + line.substring(1) + "</h2>");
                } else {
                    /* ルール5 */
                    System.out.println("<p>" + line + "</p>");
                }
            }
            /* ルール2 */
            System.out.println("</body>");
            System.out.println("</html>");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
