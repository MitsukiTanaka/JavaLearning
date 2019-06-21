package chapter16;

/**
 * 問題16-11<br>
 * List16-6のGoodBankTestの書き換え<br>
 * ヒント：OneBankのフィールドやメソッドをstaticにする。
 * それにあわせて OneBankTestを作成する<br>
 */
public class OneBank {
    private static int value = 0;   /* フィールドをstaticにする */

    public static synchronized void addMoney(int money) {   /* メソッドをstaticにする */
        int currentValue = value;
        System.out.println(Thread.currentThread() + "が addMoney に入りました。");
        value += money;
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が発生しました！");
            System.exit(-1);
        }
        System.out.println(Thread.currentThread() + "が addMoney から出ました。");
    }
}
