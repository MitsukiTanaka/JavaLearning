package chapter6;

/**
 * Q6-4 九九の表を作るプログラム
 */
public class GraphKuku {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + ", ");
            }
            System.out.println("");
        }
    }
}
