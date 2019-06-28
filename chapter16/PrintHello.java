package chapter16;

/**
 * 問題16-2 以下のコードを修正する<br>
 * <pre>{@code
 * class LabelPrinter {
 *     String label = "no label";
 *     LabelPrinter(String label) {
 *         this.label = label;
 *     }
 *     @Override
 *     public static void run() {
 *         while (true) {
 *             System.out.println(label);
 *             Thread.sleep(1000);
 *         }
 *     }
 * }
 *
 * public class PrintHello {
 *     public static void main(String[] args) {
 *         LabelPrinter th = new LabelPrinter("こんにちは！");
 *         th.start();
 *     }
 * }
 * }</pre>
 */
class LabelPrinter extends Thread {   /* LabelPrinterクラスをThreadクラスの拡張クラスとして宣言 */
    String label = "no label";

    LabelPrinter(String label) {
        this.label = label;
    }

    @Override
    public void run() {   /* staticを削除 */
        while (true) {
            System.out.println(label);
            try {
                Thread.sleep(1000);   /* Thread.sleepメソッドをtry...catchでくくる */
            } catch (InterruptedException e) {
                System.out.println("スレッドの割り込みが発生しました。");
            }
        }
    }
}

public class PrintHello {
    public static void main(String[] args) {
        LabelPrinter th = new LabelPrinter("こんにちは！");
        th.start();
    }
}
