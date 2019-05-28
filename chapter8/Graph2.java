package chapter8;

/**
 * Q8-2 メソッドprintGraphを使って、"*"で放物線を書くプログラム
 */
public class Graph2 {
    public static void main(String[] args) {
        int n;
        for (n = -8; n < 9; n++) {
            printGraph(n * n);
        }
    }

    public static void printGraph(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}