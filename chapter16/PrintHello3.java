package chapter16;

/**
 * 問題16-3<br>
 * 「おはよう！」「こんにちは！」「こんばんは！」をそれぞれ表示するスレッド3つを動かすクラスPrintHello3を宣言する
 */
class LabelPrinter2 extends Thread {
    String label = "no label";

    LabelPrinter2(String label) {
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(label);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("スレッドの割り込みが発生しました。");
            }
        }
    }
}

public class PrintHello3 {
    public static void main(String[] args) {
        LabelPrinter2 th1 = new LabelPrinter2("おはよう！");
        LabelPrinter2 th2 = new LabelPrinter2("こんにちは！");
        LabelPrinter2 th3 = new LabelPrinter2("こんばんは！");
        th1.start();
        th2.start();
        th3.start();
    }
}
