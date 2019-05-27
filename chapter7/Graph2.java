package chapter7;

/**
 * Q7-2 下記のプログラムを、while文を使って修正する<br>
 *      また、このプログラムは何をするプログラムか。<br>
 * <pre>{@code
 * public class Graph1 {
 *     public static void main(String[] args) {
 *         for (int i = 0; i < 10; i++) {
 *             for (int j = 0; j < i; j++) {
 *                 System.out.print("*");
 *             }
 *             System.out.println("");
 *         }
 *     }
 * }
 * }</pre>
 */
public class Graph2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
/**
 * ループ回数の2乗個 "*" を出力するプログラム
 */
