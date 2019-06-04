package chapter11;

/**
 * 問題11-4<br>
 * 二次元座標の点を表す下記プログラムのコンパイルエラーを解消する<br>
 * <pre>{@code
 *     class Point {
 *     int x;
 *     int y;
 *     static void setPosition(int x, int y) {
 *         this.x = x;
 *         this.y = y;
 *     }
 * }
 * }</pre>
 */
class Point {
    int x;
    int y;

    void setPosition(int x, int y) {   /* static をなくす */
        this.x = x;
        this.y = y;
    }
}
