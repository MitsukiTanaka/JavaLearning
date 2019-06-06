package chapter12;

/**
 * 問題12-4 以下の機能を持つPlacedRectangleを、Rectangleのサブクラスとして宣言する<br>
 * ・位置を表すint型のフィールドx,yをもつ<br>
 * ・3つのコンストラクタをもつ<br>
 * (1) 引数なし (2) 位置付き (3) 位置と大きさ付き<br>
 * ・位置を変更するメソッドsetLocation<br>
 * ・標準的な文字列表現を返すメソッドtoStringをもつ<br>
 * x = 12, y = 34, width = 123, height = 45のとき、<br>
 * [ (12, 34) [123,45]]となるものとする<br>
 * ただし、Rectangleクラスは次のように宣言されている<br>
 * <pre>{@code
 * class Rectangle {
 *     int width;
 *     int height;
 *
 *     Rectangle() {
 *         setSize(0, 0);
 *     }
 *     Rectangle(int width, int height) {
 *         setSize(width, height);
 *     }
 *     void setSize(int width, int height) {
 *         this.width = width;
 *         this.height = height;
 *     }
 *     @Override
 *     public String toString() {
 *         return "[" + width + ", " + height + "]";
 *     }
 * }
 * }</pre>
 */
public class PlacedRectangle extends Rectangle4 {
    int x;
    int y;

    /* コンストラクタ(1) 引数なし */
    PlacedRectangle() {
        x = 0;
        y = 0;
    }

    /* コンストラクタ(2) 位置付き */
    PlacedRectangle(int x, int y) {
        setLocation(x, y);
    }

    /* コンストラクタ(3) 位置と大きさ付き */
    PlacedRectangle(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);
    }

    /* setLocationメソッド */
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ")" + " [" + width + ", " + height + " ] ]";
    }

    public static void main(String[] args) {
        PlacedRectangle a = new PlacedRectangle();
        PlacedRectangle b = new PlacedRectangle(12, 34);
        PlacedRectangle c = new PlacedRectangle(12, 34, 123, 45);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
