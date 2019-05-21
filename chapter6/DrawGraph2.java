package chapter6;

/**
 * Q6-3 間違い探し
 * <pre>{@code
 * public class DrawGraph2 {
 *     public static void main(String[] args) {
 *         for (int i = 0; i < 10; i++) {
 *             System.out.print(i + ":");
 *             for (int j = 0; j < i; i++) {
 *                 System.out.print("*");
 *             }
 *             System.out.println("");
 *         }
 *     }
 * }
 * <pre/>
 */
public class DrawGraph2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ":");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
