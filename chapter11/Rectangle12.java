package chapter11;

/**
 * 問題11-8<br>
 * List11-7をもとに以下の内容に修正する<br>
 * widthやheightの値がマイナスであるかどうかのチェックをする<br>
 * widthとheightがマイナスになるなら、強制的に0にしてしまう<br>
 * <pre>{@code
 *     class Rectangle {
 *     int width;
 *     int height;
 *     Rectangle5() {
 *         setSize(10, 20);
 *     }
 *     Rectangle(int w, int h) {
 *         setSize(w, h);
 *     }
 *     void setSize(int w, int h) {
 *         width = w;
 *         height = h;
 *     }
 *     int getArea() {
 *         return width * height;
 *     }
 *     public static void main(String[] args) {
 *         Rectangle r1 = new Rectangle();
 *         System.out.println("r1.width = " + r1.width);
 *         System.out.println("r1.height = " + r1.height);
 *         System.out.println("r1.getArea() = " + r1.getArea());
 *         Rectangle5 r2 = new Rectangle(123, 45);
 *         System.out.println("r2.width = " + r2.width);
 *         System.out.println("r2.height = " + r2.height);
 *         System.out.println("r2.getArea() = " + r2.getArea());
 *     }
 * }
 * }</pre>
 */
public class Rectangle12 {
    int width;
    int height;

    Rectangle12() {
        setSize(10, 20);
    }

    Rectangle12(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        /* if文
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
         */
        /* 三項演算子 */
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle12 r1 = new Rectangle12();
        System.out.println("r1.width = " + r1.width);
        System.out.println("r1.height = " + r1.height);
        System.out.println("r1.getArea()= " + r1.getArea());
        Rectangle12 r2 = new Rectangle12(123, -45);
        System.out.println("r2.width = " + r2.width);
        System.out.println("r2.height = " + r2.height);
        System.out.println("r2.getArea()= " + r2.getArea());
    }
}
