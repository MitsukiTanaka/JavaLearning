package chapter10;

/**
 * 問題10-3<br>
 * 名前（name）と価格（price）をもつ「製品」を表すクラスを宣言<br>
 * 下記のプログラムを修正する<br>
 * <pre>{@code
 * public class ProductItem {
 *     char name
 *     int price
 *     @Overdrive
 *     public String toString() {
 *         return [ + name + , + price + ];
 *     }
 * }
 * }</pre>
 */
public class ProductItem {
    char name;    // nameのあとにセミコロンを追加
    int price;    // priceのあとにセミコロンを追加

    @Override
    public String toString() {
        return "[ " + name + ", " + price + " ]";   // 二重引用符を追加
    }
}
